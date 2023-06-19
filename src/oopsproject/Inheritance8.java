package oopsproject;

  class Fruits
  {
	  int Fruitage;
	  Fruits()
	  {
	  System.out.println("Fruits are cons ");
	  
	  Fruitage=7;
	  }
	  public void taste()
	  {
	  System.out.println("Fruits are sweeet ");  
	  }
	  
  }
  class orange extends Fruits
  {
	  int Fruitage;
	  orange()
	  {
		  System.out.println("orange class cons ");
		   Fruitage=5;
		   
	  }
	  public void taste()
	  {
	  System.out.println("orange are sweeet "); 
	  
	  }
	  public void shape()
	  {
	  System.out.println("Orange is round ");  
	  
	  System.out.println("Orange is Fruitage: "+Fruitage); 
	  
	  System.out.println("Fruits Fruitage is: "+super.Fruitage);
	         taste();
	         super.taste();
	         
	  }
  }

public class Inheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Start******** "); 
		  orange o1= new orange();
		  o1.shape();
		  
	  System.out.println("********End****** "); 	  
	}

}
