import java.util.Scanner;

void main(){

    Scanner sc = new Scanner(System.in);

    double entrada = sc.nextDouble();




    if (entrada > 100 || entrada < 0){
        IO.println("Fora de intervalo.");
    }
    else if (entrada <= 25.0){
        IO.println("Intervalo [0, 25]");
    }
    else if (entrada <= 50.0){
        IO.println("Intervalo [25, 50]");

    
    }
    else if (entrada <= 75){
        IO.println("Intervalo [50, 75]");
    }
    else if (entrada <= 100.0){
        IO.println("Interavlo [75, 100]");
    }


    sc.close();

}