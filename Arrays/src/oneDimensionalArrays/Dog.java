//From Head First Java  page 62.

package oneDimensionalArrays;

public class Dog {

	static String name;
	
	public static void main(String[] args) {
/*______________________________________________________________*/		
		//Make a dog object and access it.
		
		Dog dog1 = new Dog();
//		dog1.bark(); //we need to have created method bark().
		dog1.name = "Tinito";
		
/*____________________________________________________________*/		
		
		//Now make a Dog array.
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog(); //instantiates dog object referenced to by myDog[0]. 
		myDogs[1] = new Dog(); 
		myDogs[2] = dog1;
/*____________________________________________________________*/		

		//Now access the dogs using the array references
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Merge";
		//Note that you can't say dog1.name = "Tinito."
/*____________________________________________________________*/		
		
		//Hmmmm....what myDogs[2] name?
		System.out.print("Last dog's name is ");
		System.out.println(myDogs[2].name);// Also accessed thru array ref.
/*______________________________________________________________*/		
	
		//Now loop through the array and tell all dogs to bark.
		int i = 0;
		while(i < myDogs.length) {
//			myDogs[i].bark;
			i = i +1;
/*______________________________________________________________*/			
			
		//Up to now the dogs don't know how to bark. We create method bark.	
		
//			public void bark(){		//Not sure why method rejected.
			System.out.println(name + "says Ruff Ruff!");
		}
		
/*____________________________________________________________*/
//	   //Similarly u can command the dogs to eat, chaseCat etc.		
//			public void eat() { }
//			public void chaseCat() { }
//			
//		}
	}

}
