// WAP that contains two arrays of two dimensions that hold data of matrix and perform matrix operation like addition , 
// Subtraction, and multiplication.

import java.util.Scanner;

public class Matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int add[][] = new int[r][c];
        int sub[][] = new int[r][c];
        int mul[][] = new int[r][c];

        //  Matrix 1
        System.out.println("Enter elements of Matrix 1:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        //  Matrix 2
        System.out.println("Enter elements of Matrix 2:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
		
		System.out.println("===========================================================");
		
        // Addition
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                add[i][j] = a[i][j] + b[i][j];
            }
        }
		
		System.out.println("===========================================================");
		
        // Subtraction
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
		
		System.out.println("===========================================================");
		
        // Multiplication
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                mul[i][j] = 0;
                for(int k=0; k<c; k++)
                {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
		
		System.out.println("===========================================================");
		
        // Display Matrix 1
        System.out.println("\nMatrix 1:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("===========================================================");
		
        // Display Matrix 2
        System.out.println("\nMatrix 2:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("===========================================================");
		
        // Display Addition
        System.out.println("\nAddition:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("===========================================================");
		
        // Display Subtraction
        System.out.println("\nSubtraction:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("===========================================================");
		
        // Display Multiplication
        System.out.println("\nMultiplication:");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}