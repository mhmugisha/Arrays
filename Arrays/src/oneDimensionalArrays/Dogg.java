package oneDimensionalArrays;

public class Dogg 
{
   //Instance variables of class Dog.
	int weight;
	int  height;
   String breed;
   
   //Method bark. It is a void method.
   void bark() 
   {
	    if (weight > 60)
	    	System.out.println("Woof Woof Woof");
	    else if (weight > 40)
	    	System.out.println("Pwa pwa pwa");
	    else if (weight > 20)
	    	System.out.println("Bwa  bwa bwa");
	    else 
	    	System.out.println("Yip pi pi");
	      
   }
	
}
