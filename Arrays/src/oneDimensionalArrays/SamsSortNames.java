package oneDimensionalArrays;

import java.util.Arrays;

public class SamsSortNames {

	public static void main(String[] args) {
		
		String names[] = {"Mark", "Hillary", "Duncan", "Paddy", "Mugisha",
				"Divine", "Eliezer" };
		int i = 0;
		
		System.out.println("Original List:");
		for(i = 0; i < 7; i++) {
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
		Arrays.sort(names);
		
		System.out.println("Sorted list:");
		for(i = 0; i < 7; i++) {
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
		
		//My part of the code:
		System.out.println("List in Reverse order:");
		for(int j = 6; j >= 0 ; j--) {
			System.out.println(j + ": " + names[j]);
		}
		System.out.println();
	}

}
