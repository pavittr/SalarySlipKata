package org.neomatrix369.salaryslip;

public class SalarySlipGenerator {

        public SalarySlip generateFor(Employee employee) {

            Double monthlySalary = employee.getAnnualGrossSalary() / 12.0;

            Double ni = calculateNI(employee);

            return null;
        }

    private Double calculateNI(Employee employee) {
        Double rate1Earnings = 430000 - employee.getAnnualGrossSalary();
        rate1Earnings



    }

}
