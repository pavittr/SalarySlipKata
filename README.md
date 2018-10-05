Salary slip kata
================

### Problem description: Salary slip generator for UK companies.
 
  A typical salary slips contains employee details like employee id, employee name and their monthly salary details like their gross salary, national insurance contributions, tax-free allowance*, taxable income and tax payable.
  
  Salary slips are generated each month for every employee.
   
  Note: the tables used for calculating the National Insurance contributions and Taxes are for the current year (April 2016/17).
  Also note that when the Annual Gross Salary exceeds £100,000.00, personal allowance rules do not apply. Instead personal allowance decreases by a £1 for every £2 earned over £100,000.00. And this excess is taxed at the Higher rate tax.
  See [Examples: National Insurance contributions and Tax calculations](#examples-national-insurance-contributions-and-tax-calculations) for further information on the breakdown.

### Scenario: print a salary slip with employee details for an employee 
    
  <p><b>Given</b> I have an employee John J Doe with an annual gross salary of £24,000.00</p>
  <p><b>When</b> I generate a monthly salary slip for the employee</p>
  <p><b>Then</b> it should contain the below:</p>
  
           Employee ID: 12345
           Employee Name: John J Doe
           Gross Salary: £2000.00
           National Insurance contributions: £159.40
           Tax-free allowance: £916.67
           Taxable income: £1083.33
           Tax payable: £216.67 
         
   **Note:** you do not need to use any formatting or a particular currency (for example: £) or even the exact labels for the fields like above. As long as the values are representative of the details of a salary slip above, distinct and human readable.

### Acceptance criteria:
- Salary slip generator should pass an employee with its Employee Id, Employee Name and Annual Gross Salary
- Salary slip should contain the Employee ID, Employee Name, Gross Salary, National Insurance, Tax-free allowance*, Taxable income and Tax payable for the month
- The entry point should be one of the following interfaces, which you CAN NOT change:
  
  **Java** 
  ```java  
    public class SalarySlipGenerator {
        public void generateFor(Employee employee);
    }
              ----- or ----
    public class SalarySlipGenerator {
        public SalarySlip generateFor(Employee employee);
    }
  ```
  
  **Scala**
  ```scala
    class SalarySlipGenerator {
      def generateFor(employee: Employee)
    }
                ----- or ----
    class SalarySlipGenerator {
      def generateFor(employee: Employee): SalarySlip 
    }
  ```
  
  **Clojure**
  ```clojure
    <--- any suggestions? --->
  ```
  
  **Javascript**
  ```javascript
    class SalarySlipGenerator {
      void generateFor(Employee employee);
    }
                ----- or ----
    class SalarySlipGenerator {
      SalarySlip generateFor(Employee employee);
    }
  ```

  **Python**
  ```python
    class SalarySlipGenerator: 
        def generateFor(employee):
    
                  ----- or ----
    class SalarySlipGenerator:
        def generateFor(employee):
  ```  
  
  **Ruby**
  ```ruby
    class SalarySlipGenerator 
        def generateFor(employee)
        end
    
               ----- or ----
    class SalarySlipGenerator
        def generateFor(employee)
        end
    ```

  **C#**
  ```csharp
    public class SalarySlipGenerator {
      public void generateFor(Employee employee);
    }
                ----- or ----
    public class SalarySlipGenerator {
      public SalarySlip generateFor(Employee employee);
    }
  ```
      
  You can, however, add **private** methods and fields to the `SalarySlipGenerator` class, change the constructor, and add extra classes.
  
  **Note:** The term 'Tax-free allowance' is interchangeably used with the term 'Personal Allowance' and 'Tax-free Personal Allowance' in this domain.
  
### Calculations: National Insurance contributions and Tax

  See the [Calculations: National Insurance contributions and Tax](CALCULATIONS.md) section to find out what the calculations tables for both National Insurance and Tax calculations. 

### Examples: National Insurance contributions and Tax calculations

  See the [Examples: National Insurance contributions and Tax calculations](EXAMPLES.md) section for examples of the above mentioned National Insurance and Tax calculations.   
 
### Resources
- [Sample Salary Slip](http://1.bp.blogspot.com/-lJXMuMQCGtE/Udm8dlTIeSI/AAAAAAAAA1Q/jLxBZndJTAA/s1600/Pay+Slip+Format.JPG)
- [Salary calculator](http://www.thesalarycalculator.co.uk/)
- [Tax breakdown calculator - ListenToTaxman](https://listentotaxman.com/122000?)
- [Tax breakdown calculator - HMRC](http://tools.hmrc.gov.uk/hmrctaxcalculator/screen/Personal+Tax+Calculator/en-GB/summary?user=guest)
- [National insurance rates](http://www.which.co.uk/money/tax/guides/national-insurance-explained/national-insurance-rates/)
- [HMRC - National insurance rates](https://www.gov.uk/guidance/rates-and-thresholds-for-employers-2016-to-2017)
