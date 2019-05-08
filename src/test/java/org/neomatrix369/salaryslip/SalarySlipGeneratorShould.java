package org.neomatrix369.salaryslip;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class SalarySlipGeneratorShould {

    @Test
    public void employeeWith24000Should() {
        Employee employee = new Employee("ID", "Name", 24000);
        SalarySlipGenerator gen = new SalarySlipGenerator();
        SalarySlip expectedSlip = new SalarySlip("ID", "Name", 24000, 2000.00, 159.40, 916.67, 1083.33, 216.67);

        SalarySlip actualSlip = gen.generateFor(employee);
        Assert.assertThat(expectedSlip, equalTo(actualSlip));

//        Employee ID: 12345
//        Employee Name: John J Doe
//        Gross Salary: £2000.00
//        National Insurance contributions: £159.40
//        Tax-free allowance: £916.67
//        Taxable income: £1083.33
//        Tax payable: £216.67
    }
}
