package overloading;

public class OverloadMainMethod {

	public void main(int a)
	{
		System.out.println(a);
	}
	
	public void main(int a,int v)
	{
		System.out.println(a-v);
	}
	
	
	public static void main(String[] args) {
		OverloadMainMethod om = new OverloadMainMethod();
		om.main(1000);
		om.main(100, 200);
	}

}
