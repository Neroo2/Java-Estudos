package Atividade4;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maximoNumeros = 10;

        int[] valores = new int[maximoNumeros];

        for (int i = 0; i < valores.length; i++){
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            valores[i] = numero;
        }


        for (int i = 0; i< valores.length; i++){
            if (valores[i] < 0){
                System.out.println(valores[i]);
            }
        }


        sc.close();
    }


}
