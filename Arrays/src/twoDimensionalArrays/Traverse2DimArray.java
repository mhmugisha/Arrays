package twoDimensionalArrays;

public class Traverse2DimArray {

	public static void main(String[] args) {
		
		int rows = 4;
		int columns = 5;
		int[][] numbers = new int[rows][columns]; 
		
//Populating the array		

		for(int i = 0; i < rows; i++)
			for(int j = 0; j < columns; j++)
				numbers[i][j] = i*j;
			
//Printing the array. Printf is just to format array. Without it you still 
//get the array but unformatted. The Lower rows appear longer bse of larger 
//numbers.		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
				System.out.printf("%4d", numbers[i][j]);
				System.out.println();
		}
	
//Search for an element in the array: 
		int value = 4;
		
		for(int i = 0; i<rows; i++ ) 
			for(int j = 0; j < columns; j++) 
				if(numbers[i][j]== value) 
					System.out.println(value + " found " + "at position: (" + i +" , " + j + ")");
				
			
		
		
		
//		for(int[] x:numbers) {
//			for(int y: x) 
//				if(y == value)
//					System.out.println(value + " found ");
//				else;
//					System.out.println(value + "not found");
//			
	//	}
	
	}

}
