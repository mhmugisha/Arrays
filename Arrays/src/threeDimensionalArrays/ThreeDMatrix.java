
//Example from Java, The Complete Reference 8th Edition page 57.

// I have modified the program with printf and the format specifier "%4d"
//Original it was System.out.print(threeD[i][j][k] + " ")

// Demonstrate a three-dimensional array.

package threeDimensionalArrays;

public class ThreeDMatrix {

	public static void main(String[] args) {

		int threeD[][][] = new int[3][4][5];
		int i, j, k;
		
		for (i = 0; i < 3; i++)
			for (j = 0; j < 4; j++)
				for (k = 0; k < 5; k++)
					threeD[i][j][k] = i * j * k;
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 5; k++)
					System.out.printf("%4d", threeD[i][j][k]);//Originally this was System.out.print(threeD[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}

	}

}
