package com.kodilla.basic_assertion;

public class Calculator {
        public double sum(double a, int b){
            return a + b;
        }
        public double substract(double a, int b){
            return a - b;
        }
        public double power(double a, double c){
            return (double) Math.pow(a, c);         // dlaczego ten zapis jes błędny: return Math.pow(a,b);
                                                    // -5^2=-25, (-5)^2=25
    }

}