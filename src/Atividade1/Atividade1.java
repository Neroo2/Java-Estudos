package Atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height");
        Rectangle rec = new Rectangle();
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        System.out.println("Area: " + rec.areaCalc());
        System.out.println("Perimetro: " + rec.perimetroCalc());
        System.out.println("Diagonal: " + rec.diagonalCalc());

        sc.close();


    }
}
