package Atividade3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dollar price: ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollarToBeBought = sc.nextDouble();

        System.out.println("Amount to pay: " + CurrencyConverter.converter(dollarPrice, dollarToBeBought));


        sc.close();      
    }

}
