
//Example from Java, The Complete Reference 8th Edition page 55.

//Manually allocate differing size second dimensions.
//If you want same size second dimension, you do not need to manually 
//allocate 2nd Dim/column.
package twoDimensionalArrays;

public class Differing2ndDimensionSize {

	public static void main(String[] args) {

		int[][] twoD = new int[4][]; //Allocating memory only for the row dimension i.e [4]

//Array of arrays - Each row is an array object itself and the [1] in new int[1] is the dimension of the 1st array and so on.		
		twoD[0] = new int[1];//2nd dimension(column) manually and singly allocated.
		twoD[1] = new int[2];//It means that you can manually allocate different dimensions to each row not possible if it had been 
		twoD[2] = new int[3];//put at the time of declaring the array as in int[][] twoD = new int[4][4] in which case all 
		twoD[3] = new int[4];//rows would have the same 2nd dimension or same number of columns.
		int i, j, k = 0;
		for (i = 0; i < 4; i++)
			for (j = 0; j < i + 1; j++) {
				twoD[i][j] = k;
				k++;
			}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < i + 1; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}

	}

}
