package Overriding;

interface a
{
	int a=10;   // By default variable in interface is static and final
	void m1();   //abstract method by default public
	
}


public class Interface implements a
{
	public void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
	//	Interface in =new Interface();
	//	in.m1();
		
		a A=new Interface();   //a is a interface name and A is a variable
		A.m1();
	}

}
