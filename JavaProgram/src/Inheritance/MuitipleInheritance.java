package Inheritance;
interface CDE
{
	int a=200;
	void m1();
}
 
interface XYZ
{
	int x=300;
	void m1();
	
}


public class MuitipleInheritance implements CDE,XYZ {
	public void m1 ()
	{
		System.out.println(a);
	}
    
	public void m2()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		MuitipleInheritance mi =new MuitipleInheritance();
		mi.m1();
		mi.m2();
	}

	
	}

