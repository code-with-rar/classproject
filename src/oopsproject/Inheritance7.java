package oopsproject;

class Grandfather
{
   Grandfather() 
   {
	   System.out.println("I am class Grandfather Constuctor..");   	
   }
   void myhome()
   {
	   System.out.println("I am Home of  Grandfather");   
   }
}
    class Father extends Grandfather 
    {
    	 Father (double d)
    	 {
    		 super();
    		 System.out.println("I am class  of father VConstrutor..");
    		 
    	 }
    	 void myCar()
    	   {
    		   System.out.println("I am Car of my father");   
    	   }
    }
    class child extends Father 
    {
    	child(int i)
    	{
    		super (12.34);
    		System.out.println("I am Class of child constructor");   
    	}
    	void myBike ()
    	{
    		System.out.println("I am bike  of my child");
    	
    	}
    }

public class Inheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********child**********");
		   child c1 = new child(21);
		          c1.myhome();
		          c1.myCar();
		          c1.myBike();
		          
    System.out.println("***********father**********");          
		          
		          Father f1 = new child(10);
		          f1.myhome();
		          f1.myCar();
		          
    System.out.println("***********Grandfather**********"); 
    
                  Grandfather g1 = new child(20);
                  g1.myhome();
                  
    System.out.println("***********Grandfather2**********"); 
                  
                  Grandfather g2 = new child(20);
                  g2.myhome();
    
    
	}  

}
