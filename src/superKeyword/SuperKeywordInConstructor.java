package superKeyword;

class C
{
	C()
	{
		System.out.println("This is Superparent class constructor");
	}	
}
 class E 
 {
	 E()
	 {
		 System.out.println("THIS is E class Constructor");
	 }
 }
class D extends E
{

	D()
	{
		super();
		System.out.println("This is class B constructor");
	}
}


public class SuperKeywordInConstructor {

	public static void main(String[] args) 
	{
		D d = new D();
	}

}
