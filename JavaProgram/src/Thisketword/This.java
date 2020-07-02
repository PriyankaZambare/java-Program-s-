package Thisketword;

public class This {

	int a,b;
	void getValues (int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void printvalues ()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		This th =new This ();
		th.getValues(11,11);
		th.printvalues();
		
	}

}










