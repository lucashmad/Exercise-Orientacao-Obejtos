package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Office: " );
        String office = scanner.nextLine();

        System.out.print("Salary $: ");
        double salary = scanner.nextDouble();

        System.out.print("Tax: ");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(office, salary, tax);
        System.out.println();
        System.out.println(employee);

        System.out.println();
        System.out.println("Enter percentage: ");
        double percentage = scanner.nextDouble();
        employee.totalSalary(percentage);
        System.out.println("Update: " + employee);


        scanner.close();
    }



}
