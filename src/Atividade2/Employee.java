package Atividade2;

public class Employee {
    String name;
    double grossSalary;
    double tax;


    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        percentage /= 100;
        grossSalary += grossSalary * percentage;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
