package main;

import math.Calculator;

public class Main {

    Calculator calculator;
    final int N = 10;

    final int A = 1000;
    final int B = 2000;

    public Main(){
        calculator = new Calculator();
    }

    public static void main(String[] args) {

        Main mainClass = new Main();
        mainClass.loopSquared();
        mainClass.loopCube();
        mainClass.loopExp();

        Calculator ourCalc = mainClass.getCalculator();
        ourCalc.divide(1, 2);
        ourCalc.multiply(2,3);
        ourCalc.subtract(3,2);

    }

    public void loopSquared() {
        int n = N^2;
        for (int i = 0; i < n; i++) {
            calculator.add(A, B);
        }
    }

    public void loopCube() {
        int n = N^3;
        for (int i = 0; i < n; i++) {
            calculator.add(A, B);
        }
    }

    public void loopExp() {
        int n = (int) Math.exp(N);
        for (int i = 0; i < n; i++) {
            calculator.add(A, B);
        }
    }

    public Calculator getCalculator(){
        return this.calculator;
    }

}
