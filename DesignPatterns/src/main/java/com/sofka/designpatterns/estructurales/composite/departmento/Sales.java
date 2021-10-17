package com.sofka.designpatterns.estructurales.composite.departmento;

public class Sales implements Department{
    private String name;
    private Integer employees;

    public Sales(String name, Integer employees) {
        this.name = name;
        this.employees = employees;
    }

    @Override
    public void printDepartment() {
        System.out.println(String.format("Department: %s # of employees %s", name, employees.toString()));
    }
}
