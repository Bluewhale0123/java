package superKeyword;

class A1
{
	int a = 10;
}

 class A2 extends A1
 {
	 int a = 20;
	 
	 void show(int a)
	 {
		 System.out.println(a); 
		 System.out.println(this.a);    //current class
		 System.out.println(super.a);    //parent class
		 
	 }
 }

public class SuperKeywordInstanceVariable {

	public static void main(String[] args)
	{
		A2 a = new A2();
		a.show(50);

	}

}
