package OOP;

public class ParameterizedConsructor {

	int x;
	int y;
	
	ParameterizedConsructor(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void disply()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		ParameterizedConsructor pc =new ParameterizedConsructor(100,200);
		pc.disply();

	}

}
