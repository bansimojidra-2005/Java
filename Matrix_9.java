import java.util.Scanner;

class Matrix
{
    private double[][] value;
    private int rows;
    private int columns;

    // Constructor
    Matrix(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        value = new double[rows][columns];
    }

    // Constructor with values
    Matrix(double[][] values)
    {
        rows = values.length;
        columns = values[0].length;

        value = new double[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                value[i][j] = values[i][j];
            }
        }
    }

    // Input matrix
    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                value[i][j] = sc.nextDouble();
            }
        }
    }

    // Transpose
    public Matrix transpose()
    {
        Matrix result = new Matrix(columns, rows);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                result.value[j][i] = value[i][j];
            }
        }

        return result;
    }

    // Addition
    public Matrix addition(Matrix m1)
    {
        if (rows != m1.rows || columns != m1.columns)
        {
            System.out.println("Addition not possible.");
            return null;
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                result.value[i][j] = value[i][j] + m1.value[i][j];
            }
        }

        return result;
    }

    // Subtraction
    public Matrix subtraction(Matrix m1)
    {
        if (rows != m1.rows || columns != m1.columns)
        {
            System.out.println("Subtraction not possible.");
            return null;
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                result.value[i][j] = value[i][j] - m1.value[i][j];
            }
        }

        return result;
    }

    // Multiplication
    public Matrix multiplication(Matrix m1)
    {
        if (columns != m1.rows)
        {
            System.out.println("Multiplication not possible.");
            return null;
        }

        Matrix result = new Matrix(rows, m1.columns);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < m1.columns; j++)
            {
                result.value[i][j] = 0;

                for (int k = 0; k < columns; k++)
                {
                    result.value[i][j] =
                        result.value[i][j] + value[i][k] * m1.value[k][j];
                }
            }
        }

        return result;
    }

    // Inverse of 2 x 2 matrix
    public Matrix inverse()
    {
        if (rows != 2 || columns != 2)
        {
            System.out.println("Inverse is implemented for 2 x 2 matrix only.");
            return null;
        }

        double determinant =
            value[0][0] * value[1][1] -
            value[0][1] * value[1][0];

        if (determinant == 0)
        {
            System.out.println("Inverse does not exist.");
            return null;
        }

        Matrix result = new Matrix(2, 2);

        result.value[0][0] = value[1][1] / determinant;
        result.value[0][1] = -value[0][1] / determinant;
        result.value[1][0] = -value[1][0] / determinant;
        result.value[1][1] = value[0][0] / determinant;

        return result;
    }

    // Display matrix
    public String toString()
    {
        String result = "";

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                result = result + value[i][j] + "\t";
            }

            result = result + "\n";
        }

        return result;
    }
}


// Main class
public class Matrix_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        Matrix A = new Matrix(r1, c1);

        System.out.println("Enter Matrix A:");
        A.input();

        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        Matrix B = new Matrix(r2, c2);

        System.out.println("Enter Matrix B:");
        B.input();

        System.out.println("\nMatrix A:");
        System.out.println(A);

        System.out.println("Matrix B:");
        System.out.println(B);

        // Addition
        Matrix add = A.addition(B);

        if (add != null)
        {
            System.out.println("Addition:");
            System.out.println(add);
        }

        // Subtraction
        Matrix sub = A.subtraction(B);

        if (sub != null)
        {
            System.out.println("Subtraction:");
            System.out.println(sub);
        }

        // Multiplication
        Matrix mul = A.multiplication(B);

        if (mul != null)
        {
            System.out.println("Multiplication:");
            System.out.println(mul);
        }

        // Transpose
        System.out.println("Transpose of Matrix A:");
        System.out.println(A.transpose());

		System.out.println("Transpose of Matrix B:");
        System.out.println(B.transpose());

        // Inverse
        System.out.println("Inverse of Matrix A:");
        Matrix inv = A.inverse();

        		
        if (inv != null)
        {
            System.out.println(inv);
        }

        sc.close();
    }
} 