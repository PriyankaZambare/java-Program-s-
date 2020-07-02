package Inheritance;

class A{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A{
	int b;
	void print()
	{
		System.out.println(b);
	}
}


public class SingleInheritabce {

	public static void main(String[] args) {
		A aobj =new A ();
		aobj.a=111;
		aobj.display();
		
		B bobj =new B();
		bobj.a=121;
		bobj.b=212;
		bobj.display();
		bobj.print();

	}

}
