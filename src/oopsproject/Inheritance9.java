package oopsproject;

class Company202
{
	int age=2;
	{
	System.out.println("hello age is:"+age);
	}
	void display()
	{
		System.out.println("I am company  class display()..");
		
	}
}
class Employee202 extends Company202 
{
	void display()
	{
		System.out.println("I am Employ of  class display().");
		super.display();
		
	}
	void callme()
	{
		System.out.println("I am Employ of  class callme()..");
		
	}
}

public class Inheritance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start ***********");
		
          Employee202 e1 = new Employee202();
          e1.display();
          e1.callme();
          
          System.out.println("company***********");
          
          Company202 c1 = new Company202();
          c1.display();
          
          System.out.println("company2***********");
          
          Company202 e2 = new Employee202();
          e2.display();
          
	}

}
