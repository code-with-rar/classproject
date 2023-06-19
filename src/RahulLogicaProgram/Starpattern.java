package RahulLogicaProgram;

 class Starpattern
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     for ( int i=1; i<=10; i++)
     {
		 for(int x=1; x<=i; x++)
		 {
			 System.out.print("*");
			 
		 }
		     System.out.println("");
		     
	 }
     for ( int q=1; q<=10; q++) 
     {
        for(int j=10; j>=q; j--) 
           {
	          System.out.print("*");
           }
           System.out.println(); 
           }
	}
	}