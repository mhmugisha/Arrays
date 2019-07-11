
//Demonstrates how to sum an array by column. 
//1. We enter elements of matrix to console,
//2. Output the matrix itself,
//3. Sum the rows and output the sums.

package twoDimensionalArrays;

import java.util.Scanner;

public class SumByColumn {
	
	static Scanner console = new Scanner(System.in); 
	static final int ROWS = 3;
	static final int COLUMNS = 2;
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[ROWS][COLUMNS];
		
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++)
			{
			System.out.println("Enter element " + row +" x " + col + ":");
			matrix[row][col] = console.nextInt();
			}

		//outputs matrix.
		for (int row1 = 0; row1 < matrix.length; row1++)
		{
			for (int col = 0; col < matrix[row1].length; col++)
				System.out.printf("%6d", matrix[row1][col]);
				System.out.println();
		}
		
//Outputs the sum of each column in separate lines apart from the matrix.
		for (int col = 0; col < matrix[0].length; col++)
		{
		int sum = 0;
		for (int row = 0; row < matrix.length; row++)
		sum = sum + matrix[row][col];
		System.out.println("The sum of the elements of column "
				+ (col + 1) + " = " + sum);
		}
	}

}
