package Overriding;

class bank
{
double	RateOfInterest()
	{
		return 0;
	}
}


class SBI  extends bank
{
	double RateOfInterest()
	{
		return 8.9;
	}
}

class ICICI  extends bank
{
	double RateOfInterest ()
	{
	return 7.8;
	
	}
}


class AXIS extends bank
{
	double RataOfInterest()
	{
		return 7.6;
	}
}
public class OverrigingDemo {

	public static void main(String[] args) {
		

		SBI sbi =new SBI();
		System.out.println(sbi.RateOfInterest());
		
		ICICI icici=new ICICI();
		System.out.println(icici.RateOfInterest());
		}
	
	   
}
