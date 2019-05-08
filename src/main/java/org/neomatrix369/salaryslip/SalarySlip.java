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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalarySlip that = (SalarySlip) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(annualGrossSalary, that.annualGrossSalary) &&
                Objects.equals(monthlyGrossSalary, that.monthlyGrossSalary) &&
                Objects.equals(monthlyNationalInsuranceContributions, that.monthlyNationalInsuranceContributions) &&
                Objects.equals(monthlyTaxFreeAllowance, that.monthlyTaxFreeAllowance) &&
                Objects.equals(monthlyTaxableIncome, that.monthlyTaxableIncome) &&
                Objects.equals(monthlyTaxPayable, that.monthlyTaxPayable);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, annualGrossSalary, monthlyGrossSalary, monthlyNationalInsuranceContributions, monthlyTaxFreeAllowance, monthlyTaxableIncome, monthlyTaxPayable);
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
