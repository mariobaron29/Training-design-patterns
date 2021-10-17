package com.sofka.designpatterns.application;

import com.sofka.designpatterns.comportamiento.iterator.CarIterator;
import com.sofka.designpatterns.comportamiento.strategy.Context;
import com.sofka.designpatterns.comportamiento.strategy.Operation1;
import com.sofka.designpatterns.comportamiento.strategy.Operation2;
import com.sofka.designpatterns.comportamiento.strategy.Strategy;
import com.sofka.designpatterns.comportamiento.templatemethod.StartCar;
import com.sofka.designpatterns.creacionales.colores.Color;
import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.Car;
import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.CarFactory;
import com.sofka.designpatterns.creacionales.vehiculo.abstractfactory.CarFactoryProducer;
import com.sofka.designpatterns.estructurales.adapter.BrandRequest;
import com.sofka.designpatterns.estructurales.adapter.FindBrandsAdapter;
import com.sofka.designpatterns.estructurales.bridge.VehicleBridge;
import com.sofka.designpatterns.estructurales.bridge.vehiculo.Vehicle;
import com.sofka.designpatterns.estructurales.bridge.vehiculo.avion.CargoPlane;
import com.sofka.designpatterns.estructurales.bridge.vehiculo.avion.CommercialPlane;
import com.sofka.designpatterns.estructurales.bridge.vehiculo.avion.Plane;
import com.sofka.designpatterns.estructurales.composite.departmento.Company;
import com.sofka.designpatterns.estructurales.composite.departmento.Department;
import com.sofka.designpatterns.estructurales.composite.departmento.HumanResources;
import com.sofka.designpatterns.estructurales.composite.departmento.Sales;

import java.util.ArrayList;
import java.util.List;

public class MainApplication{
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        // Abstract Factory
        for(CarFactory.Type type : CarFactory.Type.values()){
            CarFactory carFactory = CarFactoryProducer.getFactory();
            FindBrandsAdapter adapter = new FindBrandsAdapter();
            List<String> brandsByType;
            Car car = carFactory.getCarByType(type);

            // Adapter
            adapter.request(new BrandRequest(car.type()));
            brandsByType = adapter.response().res;

            System.out.println("\n ##### Car #####");
            System.out.println(String.format("Type: %s  ", car.type()));
            System.out.println(String.format("\nAvailable colors:"));

            try {
                for (Color color:car.colors()) {
                    System.out.println(String.format("Code: %s name: %s", color.getCodigo(), color.getNombre()));
                }
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            System.out.println("\nSeats");
            System.out.println(String.format("Type: %s  cover: %s", car.seat().getType(),car.seat().getCover()));

            System.out.println("\nAvailable brands");
            for(String brand: brandsByType){
                System.out.println(String.format("Brand: %s ", brand));
            }

            carList.add(car);
        }

        // Bridge
        System.out.println("###### Bridge ######");
        Vehicle vehicle = new CargoPlane();
        Vehicle vehicle2 = new CommercialPlane();
        VehicleBridge plane = new Plane(vehicle, "Cargo plane");

        plane.produceVehicle();
        System.out.println("Details: " + plane.toString());

        plane = new Plane(vehicle2, "Commercial plane");
        plane.produceVehicle();
        System.out.println("Details: " + plane.toString());


        // Composite
        System.out.println("###### Composite ######");
        Department hrDepartment = new HumanResources("Recursos humanos", 10);
        Department salesDepartment = new Sales("Ventas", 15);

        Company company = new Company("Sofka Technologies", 450);

        company.addDepartment(salesDepartment);
        company.addDepartment(hrDepartment);

        company.printDepartment();


        //Iterator
        System.out.println("###### Iterator ######");
        CarIterator iterator = new CarIterator(carList);

        while(iterator.hasNext()){
            Car car = iterator.next();
            System.out.println("Car type: " + car.type());
        }

        // Strategy
        System.out.println("###### Strategy ######");
        String param1 = "Parameter 1";
        String param2 = "Param";
        Strategy strategy = new Operation1();
        Strategy strategy2 = new Operation2();
        Context context = new Context(strategy);
        Context context2 = new Context(strategy2);

        System.out.println("Context 1: " + context.executeStrategy(param1, param2));
        System.out.println("Context 2: " + context2.executeStrategy(param1, param2));

        // Template Method
        System.out.println("###### Template method  ######");
        StartCar encenderAuto = new StartCar();

        System.out.println("Starting car.");
        encenderAuto.startCar();
        System.out.println("Car started.");

    }
}
