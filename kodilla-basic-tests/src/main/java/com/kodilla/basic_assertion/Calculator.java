package com.kodilla.basic_assertion;

public class Calculator {
        public int sum(int a, int b){
            return a + b;
        }
        public int substract(int a, int b){
            return a - b;
        }
        public int power(int a, int b){
            return (int) Math.pow(a,b);         // dlaczego ten zapis jes błędny: return Math.pow(a,b);
    }
}