import java.util.Locale;

void main(){

    Locale.setDefault(Locale.US);


    Scanner sc = new Scanner(System.in);

    double x = sc.nextDouble();
    double y = sc.nextDouble();

    if (x == 0 && y == 0){
        IO.println("origem");;
    }
    else if (x > 0 && y > 0){
        IO.println("Q1");
    }
    else if (x < 0 && y > 0){
        IO.println("Q2");
    }
    else if (x < 0 && y <0){
        IO.println("Q3");
    }
    else {
        IO.println("Q4");
    }

    sc.close();
}