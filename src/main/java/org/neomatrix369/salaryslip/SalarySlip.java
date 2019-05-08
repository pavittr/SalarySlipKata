package org.neomatrix369.salaryslip;

import java.util.Objects;

public class SalarySlip {


    private final String id;
    private final String name;
    private final Integer annualGrossSalary;

    public String getName() {
        return name;
    }

    public Integer getAnnualGrossSalary() {
        return annualGrossSalary;
    }

    public Double getMonthlyGrossSalary() {
        return monthlyGrossSalary;
    }

    public Double getMonthlyNationalInsuranceContributions() {
        return monthlyNationalInsuranceContributions;
    }

    public Double getMonthlyTaxFreeAllowance() {
        return monthlyTaxFreeAllowance;
    }

    public Double getMonthlyTaxableIncome() {
        return monthlyTaxableIncome;
    }

    public Double getMonthlyTaxPayable() {
        return monthlyTaxPayable;
    }

    public String getId() {

        return id;
    }

    private final Double monthlyGrossSalary;
    private final Double monthlyNationalInsuranceContributions;
    private final Double monthlyTaxFreeAllowance;
    private final Double monthlyTaxableIncome;
    private final Double monthlyTaxPayable;


    public SalarySlip(String id, String name, Integer annualGrossSalary, Double monthlyGrossSalary, Double monthlyNationalInsuranceContributions, Double monthlyTaxFreeAllowance, Double monthlyTaxableIncome, Double monthlyTaxPayable) {
        this.id = id;
        this.name = name;
        this.annualGrossSalary = annualGrossSalary;
        this.monthlyGrossSalary = monthlyGrossSalary;
        this.monthlyNationalInsuranceContributions = monthlyNationalInsuranceContributions;
        this.monthlyTaxFreeAllowance = monthlyTaxFreeAllowance;
        this.monthlyTaxableIncome = monthlyTaxableIncome;
        this.monthlyTaxPayable = monthlyTaxPayable;
    }
}
