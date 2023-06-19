package RahulLogicaProgram;


  
 class Thiskeyword {
          
	      int variable= 5;
	      int age =10;
	         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Thiskeyword myobj1 = new Thiskeyword();
	
	
         myobj1.method(20);
         myobj1.method();
         
        System.out.println("obj gv variable is "+myobj1.variable);
        
        Thiskeyword myobj2 = new Thiskeyword(); 
        System.out.println("gv variable is "+myobj2.variable);
	}
        
         
        void method(int variable )
        {
        	System.out.println("Value of variable is "+variable);
        	System.out.println("Value of variable is "+this.variable);
        	
        	this.variable= variable;
        	      
        	System.out.println("Value of variable is "+variable);
        	System.out.println("Value of variable is "+variable);
        	System.out.println("Value of variable is "+this.variable);
        }
        void method()
        {
        	int variable1=40;
        	System.out.println("Value of variable is "+variable1);
        	
        }
	}     		 
 
