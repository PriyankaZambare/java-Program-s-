package AccessModifiers;
class a
{
//	private int data=20;
//	private void m1() {}
    
	
	
	int data=20;
	void m1()
	
	{
		System.out.println(data);
	}
}


public class Private {
	

	public static void main(String[] args) {
	a aobj =new a();
	aobj.data=40;   //compile time error
	aobj.m1();  // compile time error
		

	}


}