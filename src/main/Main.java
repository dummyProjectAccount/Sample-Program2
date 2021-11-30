package main;

import simpleArithmeticOp.Calculator;
import util.MatrixMath;

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

        int num = 1000;

        MatrixMath matrixMath = new MatrixMath();

        double[][] firstMatrix = new double[num][num];
        double[][] secondMatrix = new double[num][num];

        for(int i = 0; i < num; i++) {
            matrixMath.initializeMatrixInner(firstMatrix[i], num);
            matrixMath.initializeMatrixInner(secondMatrix[i], num);
        }

        double[][] result = matrixMath.multiplyMatrices(firstMatrix, secondMatrix);


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
