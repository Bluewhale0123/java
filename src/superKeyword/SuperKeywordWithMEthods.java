package superKeyword;

class A{
	
	void m1()
	{
		System.out.println("This is m1 method of parent class");
	}
}

class B extends A{
	
	void m1()
	{
		System.out.println("This is m1 method of child class");
	}
	
	void show() {
		m1();
		super.m1();
	}
}



public class SuperKeywordWithMEthods {

	public static void main(String[] args) {
		 B b = new B();
		 b.show();
	}

}
