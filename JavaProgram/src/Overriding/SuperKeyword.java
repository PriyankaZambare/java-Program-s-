package Overriding;

public class SuperKeyword {
	String color= "white";
	void eating()
	{
		System.out.println("Eating ..........");
	}
	SuperKeyword()
	{
		System.out.println("superkeyword is created");
	}
}
 class dog extends SuperKeyword 
 {
	 String color= "Black";
/*	 void displaycolor()
     {
		 System.out.println(color);
		 System.out.println(super.color);
	
	 */
	 
	 void eating()
		{
			System.out.println("Eating Bread..........");
			super.eating();
		}
 
 dog()
 {
	 super();  //invoke parent class constructor
	 System.out.println("dog is created");
 }
	
}
