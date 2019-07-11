package oneDimensionalArrays;

public class Play2 {

	public static void main(String[] args) {
	
		int numValues = 8;
		int[] array = randomArray(numValues);
		printArray(array);
		
	}
	public static void printArray(int[] a) {
		for (int i = 0; i<a.length; i++) {
		System.out.println(a[i]);
		}
	}
		public static int[] randomArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i<a.length; i++) {
			a[i] = randomInt(0, 100);
			}
			return a;
			}
		
		private static int randomInt(int i, int j) {
			
			return 0;
		}
	
}
