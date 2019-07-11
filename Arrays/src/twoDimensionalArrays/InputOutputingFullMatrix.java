package twoDimensionalArrays;

import java.util.Scanner;

public class InputOutputingFullMatrix {
	
	static Scanner console = new Scanner(System.in);
	static final int ROWS = 3;
	static final int COLUMNS = 2;
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[ROWS][COLUMNS];
		
	//Nested for loop to input elements into matrix. 
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++)
			{
			System.out.println("Enter element " + row +" x " + col + ":");
			matrix[row][col] = console.nextInt();
			}
	//Nested for loop to output the matrix.		
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[row].length; col++)
			System.out.printf("%6d", matrix[row][col]);
			System.out.println();
		}
	}

}
