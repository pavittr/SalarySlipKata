package org.neomatrix369.salaryslip;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class SalarySlipGeneratorShould {

    @Test
    public void employeeWith24000Should() {
        Employee employee = new Employee("ID", "Name", 24000);
        SalarySlipGenerator gen = new SalarySlipGenerator();
        SalarySlip expectedSlip = new SalarySlip("ID", "Name", 24000, 2000.00, 159.40, 916.67, 1083.33, 216.67);

        SalarySlip actualSlip = gen.generateFor(employee);

        Assert.assertThat(actualSlip.getId(), equalTo(expectedSlip.getId()));
        Assert.assertThat(actualSlip.getName(), equalTo(expectedSlip.getName()));
        Assert.assertThat(actualSlip.getAnnualGrossSalary(), equalTo(expectedSlip.getAnnualGrossSalary()));
        Assert.assertThat(actualSlip.getMonthlyGrossSalary(), Matchers.closeTo(expectedSlip.getMonthlyGrossSalary(), 0.001));
        Assert.assertThat(actualSlip.getMonthlyNationalInsuranceContributions(), Matchers.closeTo(expectedSlip.getMonthlyNationalInsuranceContributions(), 0.0001));
        Assert.assertThat(actualSlip.getMonthlyTaxFreeAllowance(), Matchers.closeTo(expectedSlip.getMonthlyTaxFreeAllowance(), 0.0001));
        Assert.assertThat(actualSlip.getMonthlyTaxableIncome(), Matchers.closeTo(expectedSlip.getMonthlyTaxableIncome(), 0.0001));
        Assert.assertThat(actualSlip.getMonthlyTaxPayable(), Matchers.closeTo(expectedSlip.getMonthlyTaxPayable(), 0.0001));




//        Employee ID: 12345
//        Employee Name: John J Doe
//        Gross Salary: £2000.00
//        National Insurance contributions: £159.40
//        Tax-free allowance: £916.67
//        Taxable income: £1083.33
//        Tax payable: £216.67
    }
}
