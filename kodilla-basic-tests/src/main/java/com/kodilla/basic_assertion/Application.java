package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double a = -5;
        int b = 8;
        double c = 2;

        double sumResult = calculator.sum(a,b);
        double substractResult = calculator.substract(a,b);
        double powerResult = calculator.power(a,c);

        boolean sumCorrect = ResultChecker.assertEquals(3,sumResult, 0.1);
        if (sumCorrect) {
            System.out.println("Wynik dodawania poprawny");
        }else{
            System.out.println("Wynik dodawania błędny");
        }

        boolean substractCorrect = ResultChecker.assertEquals(-13,substractResult, 0.1);
        if (substractCorrect) {
            System.out.println("Wynik odejmowania poprawny");
        }else{
            System.out.println("Wynik odejmowania błędny");
        }

        boolean powerCorrect = ResultChecker.assertEquals(-25.0,powerResult, 0.1);
        if (powerCorrect) {
            System.out.println("Wynik potęgowania poprawny");
        }else{
            System.out.println("Wynik potęgowania błędny - zwrócony wynik: "+ powerResult);
        }
    }
}
