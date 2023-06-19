package oopsproject;

class A1{
	static int a=10;
	int b=20;
	double c=13.45;
}
class B1 extends A1 {
	static int x=10;
	int y=40;
	double z=53.45;
}
class C1 extends B1 {
	static int p=10;
	int q=60;
	double r=66.45;
}



public class Inheritamce {

	public static void main(String[] args) {
		// static variable member

	System.out.println("class a Static variable:"+A1.a);
	System.out.println("class a Static variable:"+B1.x);
	System.out.println("class a Static variable:"+C1.p);	
		
	//acess non static variable 
//	 A1 a1= new A1();
//	System.out.println("class a Static variable:"+a1.b);  
//	System.out.println("class a Static variable:"+a1.c);
//	
	 B1 b1= new B1();
	 
	System.out.println("class B a Static variable:"+b1.b);  
	System.out.println("class B a Static variable:"+b1.c);
	System.out.println("class B a Static variable:"+b1.y);  
	System.out.println("class B a Static variable:"+b1.z);
			
	
	
	 C1 c1= new C1();
	System.out.println("class C Static variable:"+c1.q);  
	System.out.println("class C Static variable:"+c1.r);
	System.out.println("class C Static variable:"+c1.b);  
	System.out.println("class C Static variable:"+c1.c);
	System.out.println("class C Static variable:"+c1.y);  
	System.out.println("class C Static variable:"+c1.z);
							
	
	
	}
	

}
