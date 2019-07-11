package oneDimensionalArrays;

public class BooksTestDrive {

	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		int x = 0;
		
		//Creating the books objects.
		myBooks[0] = new Books(); //instantiating object book referenced to by myBooks[0]
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		
		//Accessing the books thru their reference variables
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cook Book";
		myBooks[0].author = "Bob.";
		myBooks[1].author = "Sue.";
		myBooks[2].author = "Ian.";
		
		//Output
		while (x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x+1;
		}
			
	}

}
