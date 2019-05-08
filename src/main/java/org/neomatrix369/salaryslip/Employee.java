package org.neomatrix369.salaryslip;

public class Employee {

    private final String id;
    private final String name;
    private final Integer annualGrossSalary;


    public Employee(String id, String name, Integer annualGrossSalary) {
        this.id = id;
        this.name = name;
        this.annualGrossSalary = annualGrossSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Integer getAnnualGrossSalary() {
        return annualGrossSalary;
    }
}
