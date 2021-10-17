package com.sofka.designpatterns.application;

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

import java.util.List;

public class MainApplication{
    public static void main(String[] args) {
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


    }
}
