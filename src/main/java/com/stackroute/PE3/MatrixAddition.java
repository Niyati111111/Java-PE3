package com.stackroute.PE3;

public class MatrixAddition {

      public int[][] addMatrix(int[][] matrix, int[][] anotherMatrix) {
          int rowMatrix = matrix.length;
          int columnMatrix = matrix[0].length;
          int rowAnotherMatrix = anotherMatrix.length;
          int columnAnotherMatrix = anotherMatrix[0].length;
          int result[][] = new int[rowMatrix][columnMatrix];

          for(int i=0;i<rowAnotherMatrix;++i) {
              for(int j=0; j<columnAnotherMatrix; ++j) {
                  result[i][j] = matrix[i][j] + anotherMatrix[i][j];
              }
          }

          return result;
      }

      public String checkDimensions(int rowMatrix, int rowAnotherMatrix) {
          if(rowMatrix == rowAnotherMatrix){
              return "success";
          } else {
              return "failure";
          }
      }

}
