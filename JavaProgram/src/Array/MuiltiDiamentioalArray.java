package Array;

public class MuiltiDiamentioalArray {
	public static void main(String[] args) {
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=300;
		a[1][0]=200;
		a[1][1]=400;
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}
}