package org.neomatrix369.salaryslip;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalarySlipGenerator {

        public SalarySlip generateFor(Employee employee) {

            Double monthlySalary = employee.getAnnualGrossSalary() / 12.0;

            Double ni = calculateNI(employee);

            Double monthlyTaxFreeAllowance = calculateTaxFreeAllowance(employee);

            Double monthlyTaxableIncome = calculateTaxableIncome(employee);
            
            Double monthlyTaxPayable = calculateTaxPayable(employee);

            return new SalarySlip(employee.getId(), employee.getName(), employee.getAnnualGrossSalary(), monthlySalary, ni, monthlyTaxFreeAllowance, monthlyTaxableIncome, monthlyTaxPayable);
        }

    private Double calculateTaxPayable(Employee employee) {
        Double rate1Earnings = (employee.getAnnualGrossSalary() - 11000.00) / 12.0;
        BigDecimal bd = new BigDecimal(rate1Earnings *0.2);
        bd = bd.setScale(2, RoundingMode.HALF_UP);;
        return bd.doubleValue();
    }

    private Double calculateTaxFreeAllowance(Employee employee) {

        Double rate1Earnings =  11000.00 / 12.0;
        BigDecimal bd = new BigDecimal(rate1Earnings );
        bd = bd.setScale(2, RoundingMode.HALF_UP);;
        return bd.doubleValue();
    }



    private Double calculateTaxableIncome(Employee employee) {

        Double rate1Earnings = (employee.getAnnualGrossSalary() - 11000.00) / 12.0;
        BigDecimal bd = new BigDecimal(rate1Earnings );
        bd = bd.setScale(2, RoundingMode.HALF_UP);;
        return bd.doubleValue();
    }

    private Double calculateNI(Employee employee) {
        Double rate1Earnings = (employee.getAnnualGrossSalary() - 8060.00) / 12.0;
        BigDecimal bd = new BigDecimal(rate1Earnings * 0.12);
        bd = bd.setScale(2, RoundingMode.HALF_UP);;
return bd.doubleValue();


    }

}
