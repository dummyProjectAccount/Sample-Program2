package util;

import simpleArithmeticOp.Calculator;

public class MatrixMath {

    public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            result[row] = this.multiplyMatricesIntermediate(firstMatrix, secondMatrix, row);
        }

        return result;
    }

    public double[] multiplyMatricesIntermediate(double[][] firstMatrix, double[][] secondMatrix, int row) {
        double[] result = new double[secondMatrix[0].length];
        for (int col = 0; col < result.length; col++) {
            result[col] = this.multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
        }
        return result;
    }



    public double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        double cell = 0;
        Calculator calculator = new Calculator();
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += calculator.multiply(firstMatrix[row][i], secondMatrix[i][col]);

        }
        return cell;
    }

    public void initializeMatrixInner(double[] row, int num) {
        for(int i = 0; i < row.length; i++) {
            row[i] = num;
        }
    }

}