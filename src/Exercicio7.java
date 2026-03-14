import java.util.Scanner;

void main(){


    Scanner sc = new Scanner(System.in);

    int horaInicial = sc.nextInt();
    int horaFinal = sc.nextInt();

    int duracao;


    if (horaInicial < horaFinal){
        duracao = horaFinal - horaInicial;
    }
    else{

        duracao = 24 - horaInicial + horaFinal;
    }

    IO.println("A duração do jogo foi de: " + duracao + " horas");

    sc.close();

}