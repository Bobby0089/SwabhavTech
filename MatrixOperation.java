package Array2D;

import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner sc = new Scanner(System.in);

        // Input matrix 1 dimensions and elements
        System.out.print("Enter number of rows for matrix 1: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for matrix 1: ");
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter " + (rows1 * cols1) + " elements for matrix 1:");
        for (int i = 0; i < rows1; i++)
        {
            for (int j = 0; j < cols1; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input matrix 2 dimensions and elements
        System.out.print("Enter number of rows for matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for matrix 2: ");
        int cols2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter " + (rows2 * cols2) + " elements for matrix 2:");
        for (int i = 0; i < rows2; i++)
        {
            for (int j = 0; j < cols2; j++)
            {
                matrix2[i][j] = sc.nextInt(); 
            }
        }

        // Check if matrix dimensions match for addition, subtraction, or multiplication
        if (rows1 != rows2 || cols1 != cols2)
        {
            System.out.println("Matrices dimensions do not match.");
            return; // Exit the program if dimensions don't match
        }

       
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Transpose");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        //matrix to store the result of operations
        int[][] result = new int[rows1][cols1];

        // Perform the operation based on user choice
        if (choice == 1)
        { // Addition
            for (int i = 0; i < rows1; i++)
            {
                for (int j = 0; j < cols1; j++)
                {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        else if (choice == 2)
        { // Subtraction
            for (int i = 0; i < rows1; i++)
            {
                for (int j = 0; j < cols1; j++)
                {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        else if (choice == 3)
        { // Multiplication
            if (cols1 != rows2)
            {
                System.out.println("Multiplication not possible due to incorrect dimensions.");
                return;
            }
            result = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++)
            {
                for (int j = 0; j < cols2; j++)
                {
                    for (int k = 0; k < cols1; k++)
                    {
                        result[i][j] += matrix1[i][k] * matrix2[k][j]; // Perform matrix multiplication
                    }
                }
            }
        }
        else if (choice == 4)
        { // Transpose
            System.out.print("Transpose which matrix (1/2)? ");
            int reply = sc.nextInt();
            if (reply == 1)
            { 
                result = new int[cols1][rows1]; 
                for (int i = 0; i < cols1; i++)
                {
                    for (int j = 0; j < rows1; j++)
                    {
                        result[i][j] = matrix1[j][i]; // Transpose elements
                    }
                }
            }
            else
            { // Transpose matrix 2
                result = new int[cols2][rows2]; 
                for (int i = 0; i < cols2; i++)
                {
                    for (int j = 0; j < rows2; j++)
                    {
                        result[i][j] = matrix2[j][i]; // Transpose elements
                    }
                }
            }
        }
        else
        {
            System.out.println("Invalid input.");
            return; 
        }

       
        System.out.println();
        System.out.println("Result array:");
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
            {
                System.out.print(result[i][j] + " "); // Print each element of the result matrix
            }
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}
