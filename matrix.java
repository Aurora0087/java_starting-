package com.matrix;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter row number ::");
        int r=s.nextInt();
        System.out.print("Enter column number ::");
        int c=s.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter matrix value ::");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Row number "+(i+1)+" and column number "+(j+1)+" = ");
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Given matrix given below ::");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
