package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 2;

        int sumResult = calculator.sum(a,b);
        int substractResult = calculator.substract(a,b);
        int powerResult = calculator.power(a,c);

        boolean sumCorrect = ResultChecker.assertEquals(13,sumResult);
        if (sumCorrect) {
            System.out.println("Wynik dodawania poprawny");
        }else{
            System.out.println("Wynik dodawania błędny");
        }

        boolean substractCorrect = ResultChecker.assertEquals(-3,substractResult);
        if (substractCorrect) {
            System.out.println("Wynik odejmowania poprawny");
        }else{
            System.out.println("Wynik odejmowania błędny");
        }

        boolean powerCorrect = ResultChecker.assertEquals(25,powerResult);
        if (powerCorrect) {
            System.out.println("Wynik potęgowania poprawny");
        }else{
            System.out.println("Wynik potęgowania błędny");
        }
    }
}
