package day31_CustomClass_Constructors;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours ;
    public double stateTaxRate, federalTaxRate;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary(){
     return hourlyRate * weeklyHours * 52;
    }
     public double stateTax(){
        return salary()*stateTaxRate;
     }
     public double federalTax(){
        return  salary()*federalTaxRate;
     }
     public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
     }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "SalaryCalculator{" +
                "salary= $" + df.format( salary() ) +
                ", stateTax= $" + df.format(stateTax()) +
                ", federalTax= $" + df.format(federalTax()) +
                ", salaryAfterTax= $" + df.format(salaryAfterTax()) +
                '}';
    }
}

/*
SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object


 */