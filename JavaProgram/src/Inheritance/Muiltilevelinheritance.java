package Inheritance;

class abc 
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class bab extends abc{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C extends bab{
	int c;
	void show()
	{
		System.out.println(c);
	}
}


public class Muiltilevelinheritance {

	public static void main(String[] args) {
		C cobj=new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.print();
		cobj.show();

	}

}
