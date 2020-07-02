package Thisketword;

public class StaticVariable {

	static int a=10; //static variable 
	int b=20;  //non-static variable
	static void m1()
	{
		System.out.println("m1 is a static method");
	}
	
	void m2()
	{
		System.out.println("m2 is a non static method");
	}
	
	void m3()
	{
		System.out.println("m3 is a non static method");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	public static void main(String[] args) {
		// static method can access only static stuff.
		System.out.println(a);
		m1();
		
	//	System.out.println(b);  incorrect because b id non static variable 
     //   m2();  incorrect because m2 is non static method.
		
		// static method can access non static stuff but through object
		StaticVariable sv=new StaticVariable();
		System.out.println(sv.b);  //non static variable through object
		sv.m2();  ///non static method through object
	    sv.m3();
	
	}

}
