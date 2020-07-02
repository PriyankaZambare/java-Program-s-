package OOP;

public class constructor {

	

		int sRollno;
		String sname;
		char grade;
		
		constructor(int sno, String name, char g)
		{
			sRollno=sno;
			sname=name;
			grade=g;
			
		}

		void display()
		{
			System.out.println(sRollno+"  "+sname+"  "+grade);
		}
		
		public static void main(String[] args) {
			
			constructor con=new constructor(111,"riya",'b');
			con.display();
			
			
			
	}

}
