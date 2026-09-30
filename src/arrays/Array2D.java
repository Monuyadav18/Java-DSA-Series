package arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        //declaration
        int[][] matrix;

        //allocation
        matrix = new int[3][4];

        //initialization

        int[][] matrix2 = {
                {1,2,33,64},
                {4,25,6,17},
        };

        int[][] mat = new int[2][4];
        Scanner sc = new Scanner(System.in);

        //input
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                System.out.println("provide matrix row " + i + " column " + j);
//                mat[i][j] = sc.nextInt();
//            }
//        }

        //print
//        for (int i = 0; i < mat.length; i++) {
//           for (int j = 0; j < mat[i].length; j++) {
//               System.out.print(mat[i][j] + " ");
//           }
//            System.out.println();
//        }
//
//        //sum of 2D Array
//        int sum = 0;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                sum += mat[i][j];
//            }
//        }
//        System.out.println("Sum of matrix is: " + sum);

//        int rowIndex = matrix2.length;
//        int colIndex = matrix2[0].length;
//
//        for(int i = 0; i < rowIndex; i++) {
//            for(int j = 0; j < colIndex; j++) {
//                System.out.print(matrix2[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] matrix3 = {
                {1,2,3,},
                {4,5,6,7, 8, 9},
                {7,8}
        };
//        int rowlength = matrix.length;
//        for (int rowindex = 0; rowindex < rowlength; rowindex++) {
//            int collength = matrix3[rowindex].length;
//            for (int colindex = 0; colindex < collength; colindex++) {
//                System.out.print(matrix3[rowindex][colindex] );
//            }
//            System.out.println();
//        }

        //Print maxValue of array

        int maxValue = 1;
        for(int i = 0; i < matrix2.length; i++) {
            for(int j = 0; j < matrix2[i] .length; j++) {
                if(matrix2[i][j] > maxValue) {
                    maxValue = matrix2[i][j];
                }
            }
        }
        System.out.println(maxValue);

    }
}
