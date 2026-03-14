import java.util.Scanner;

void main(){

    Scanner sc = new Scanner(System.in);

    int codigo = sc.nextInt();
    int quantidade = sc.nextInt();


    double preco = 0.00;
    double total;


    if (codigo == 1){
        preco = 4.00;
    }
    else if (codigo == 2){
        preco = 4.50;
    }
    else if (codigo == 3){
        preco = 5.00;
    }
    else if (codigo == 4){
        preco = 2.00;
    }
    else if (codigo == 5){
        preco = 1.50;
    }

    total = quantidade * preco;

    IO.println("O total é de: R$ " + total);

    sc.close();
}