package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        // hourlyRate, weeklyHours

        int hourlyRate =65;
        int weeklyHours =45;
        int numberOfWeeks = 52;

        //int salary = hourlyRate * weeklyHours * 52;// 52 weeks
        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        //System.out.println(salary);
        // concatenation print statement
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary  = $" + salary);
    }
}
