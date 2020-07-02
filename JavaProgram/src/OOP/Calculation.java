package OOP;

public class Calculation {

	int x=10;
	int y=20;
/*	 void sum()
	 {
		 System.out.println(x+y);   //Case1 - not taking parameter and not taking any value.
		 
	 }
	*/
	
/*	int sum()      //case 2 - not taking parameter return value
	{
		return(x+y);
	}
	*/
	
/*	void sum(int a, int b)     // case 3- taking parameter but not taking any values
	{
		System.out.println(a+b);
	}
	*/
	int sum(int a, int b)      // case-4 taking parameter and taking value
	{
		return (a+b);
		
	}
	

	public static void main(String[] args) {
		Calculation cal=new Calculation();
	//			cal.sum();   //case1
/*	int res=cal.sum();  //case 2
	System.out.println(res);
*/
	
//		cal.sum(100,222);  //case3
	System.out.println(cal.sum(111, 222));  //case4
	}

}
