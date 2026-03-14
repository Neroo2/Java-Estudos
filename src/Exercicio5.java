import java.util.Scanner;

void main(){

    Scanner sc = new Scanner(System.in);

    int a;
    a = sc.nextInt();


    if (a % 2 == 0){
        IO.println("O numero é par");
    }
    else {
        IO.println("O numero é impar");
    }


    sc.close();

}