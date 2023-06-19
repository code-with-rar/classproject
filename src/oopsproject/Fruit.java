package oopsproject;


  public class Fruit {
         Fruit()
      {
    	  System.out.println("fruit class cons..");
       
      }
      void taste() {
    	  System.out.println("fruit are sweet");  
    	  
      }
 }
	class apple extends Fruit {
		apple(){
			
			System.out.println("Apple class cons..");
			
		}
		 void shape() {
	    	  System.out.println("Apple is round ");  
	    	  
	      }
	 }
   class inheritance {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            apple fruit = new apple();
        
            
            fruit.taste();
            fruit.shape();	
            
	}

	}
