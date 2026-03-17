package Atividade2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();


        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Update salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println(employee);


        sc.close();

    }
}
