package Inheritance;

class parent
{
	int a;
void display() {
	System.out.println(a);
}
}

class child1 extends parent
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class child2 extends parent
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}
public class HierachyInhehitance {

	public static void main(String[] args) {
     
		child1 ch1 =new child1();
		ch1.a=10;
		ch1.b=20;
		ch1.display();
		ch1.show();
		
		
		child2 ch2=new child2();
		ch2.a=30;
		ch2.c=40;
        ch2.display();
        ch2.print();
	}

}
