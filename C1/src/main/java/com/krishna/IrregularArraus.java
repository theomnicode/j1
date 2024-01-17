package com.krishna;

import java.util.Scanner;

public class IrregularArraus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rowSize = sc.nextInt();
        int[][] matrix = new int[rowSize][];
        int colSize;
        for(int i=0;i<rowSize;i++){
            System.out.println("Enter number of columns in row "+(i+1));
            colSize = sc.nextInt();
            matrix[i] = new int[colSize];
        }

        for(int i=0;i<matrix.length;i++){
            System.out.println("Enter "+(i+1)+" row data");
            for(int j =0;j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"      ");
            }
            System.out.println("");
        }
    }
}
