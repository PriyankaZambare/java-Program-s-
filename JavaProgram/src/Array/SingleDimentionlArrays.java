package Array;

public class SingleDimentionlArrays {

	public static void main(String[] args) {
	
/*	int a[]= new int [4];
	a[0]=111;
	a[1]=222;
	a[2]=333;
	a[3]=444;
	*/
		int a[]= {100,200,300,400,500,600};
	System.out.println(a[2]);
	System.out.println(a.length);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
	// enhanced for loop
	for(int i:a)
	{
	System.out.println(i);
	}

}
}