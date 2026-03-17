package Atividade1;

public class Rectangle {

    double width;
    double height;


    public double areaCalc(double w, double h){
        return w * h;
    }


    public double perimetroCalc(double w, double h){
        return 2 * (w + h);
    }

    public double diagonalCalc(double w, double h){
        return Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
    }

}