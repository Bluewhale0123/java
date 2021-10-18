package FinalKeyword;

class Variable1
{
	void show()
	{
	final int i=20;
	//i=i+20;   //we cannot change the value of final variable
	System.out.println(i);
	}
}

public class WithVariable {

	public static void main(String[] args)
	{
		Variable1 a = new Variable1();
		a.show();
		
	}

}
