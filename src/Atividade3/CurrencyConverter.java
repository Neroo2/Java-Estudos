package Atividade3;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double dollarPrice, double dollarToBeBought){
        return dollarPrice * dollarToBeBought * (1 + IOF);
    }


}
