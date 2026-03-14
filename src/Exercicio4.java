import java.util.Scanner;

void main(){

    Scanner sc = new Scanner(System.in);

    int numero = sc.nextInt();


    if (numero > 0){
        IO.println("O numero é positivo");
    }
    else {
        IO.println("O numero é negativo");
    }

    sc.close();

}