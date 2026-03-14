import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);

    int A, B, C, D, produtoAB, produtoCD ,diferenca;

    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();

    produtoAB = A * B;
    produtoCD = C * D;

    diferenca = produtoAB - produtoCD;


    IO.println("A diferença é: " + diferenca);

    sc.close();


}