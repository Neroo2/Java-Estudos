import java.util.Scanner;

void main(){

    Scanner sc = new Scanner(System.in);

    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    if (a % b == 0 || b % a == 0){
        IO.println("Eles são multiplos");
    }
    else{
        IO.println("Eles não são multiplos");
    }


    sc.close();

}