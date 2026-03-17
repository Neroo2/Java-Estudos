package Atividade1;

public class Rectangle {

    double width;
    double height;


    public double areaCalc(){
        return width * height;
    }


    public double perimetroCalc(){
        return 2 * (width + height);
    }

    public double diagonalCalc(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}