import java.util.Scanner;

void main(){

    Scanner sc = new Scanner(System.in);

    float pi, raio, resultado;
    pi = 3.14159f;
    raio = sc.nextFloat();
    resultado = pi * raio * raio;

    IO.println("O raio do círculo é: " + resultado);

    sc.close();

}