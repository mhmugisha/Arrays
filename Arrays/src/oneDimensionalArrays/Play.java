package oneDimensionalArrays;

import java.util.Scanner;

public class Play {
	
	static Scanner console = new Scanner(System.in);
	static final int ROWS = 5;
	static final int COLUMNS = 6;
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[ROWS][COLUMNS];
		
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++)
				matrix[row][col] = 12;

		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[row].length; col++)
				System.out.printf("%6d", matrix[row][col]);
				System.out.println();
		}
		
		
		
	}
	

}
