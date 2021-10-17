package com.sofka.designpatterns.estructurales.composite.departmento;

import java.util.ArrayList;
import java.util.List;

public class Company implements Department {
    private Integer totalEmployees;
    private String name;

    private List<Department> departamentos;

    public Company( String name, Integer totalEmployees) {
        this.totalEmployees = totalEmployees;
        this.name = name;
        this.departamentos = new ArrayList<>();
    }

    public void printDepartment() {
        departamentos.forEach(Department::printDepartment);
    }

    public void addDepartment(Department department) {
        departamentos.add(department);
    }

    public void removeDepartment(Department department) {
        departamentos.remove(department);
    }
}
