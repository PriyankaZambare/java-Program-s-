package OOP;

public class defaultConstructor {

	int c;
	int d;
	defaultConstructor()
	{
		c=10;
		d=20;
	}
	void display()
	{
		System.out.println(c+d);
	}
	
	public static void main(String[] args) {
		defaultConstructor dm=new defaultConstructor();
		dm.display();		
	}

}
