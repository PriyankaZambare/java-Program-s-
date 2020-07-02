package OOP;

public class MethodVariables {

	
		int sRollno;
		String sname;
		char grade;
		
		void GetValues(int no, String name, char g)
		{
			sRollno=no;
			sname=name;
			grade=g;
		}
		
		
		void display()
		{
			System.out.println(sRollno+"  "+sname+"  "+grade);
		}
	
public static void main(String[] args) {
	MethodVariables stu=new MethodVariables();
/*	stu.sRollno=152;
	stu.sname="Neha ";
	stu.grade= 'c';
	stu.display();
	*/
	
	stu.GetValues(101, "neha", 'c');
	stu.display();
	
}
}