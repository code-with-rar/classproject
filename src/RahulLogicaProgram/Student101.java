package RahulLogicaProgram;

 class Student101 {
	 int rollno;
     float fee;
     Student101(int rollno)
     {  
  	    this.rollno = rollno;
  	   
     }
        Student101(int rollno, float fee) 
     { 
    	
  	    this.rollno=rollno;
  	   
  	    this.fee= fee;
     }
      void display() 
     {
  	    System.out.println("Final answer"+rollno +" "+fee);
     }
 }
 
 class ThisStatement3 { 
    	 
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********creating S1 object****");
		
		Student101 s1= new Student101(111);
		System.out.println(s1.rollno +" "+s1.fee);
		
		System.out.println("**********creating S2 object****");
		
		Student101 s2= new Student101(111,6000f);
	    System.out.println(s2.rollno +" "+s2.fee);
	    
        System.out.println("**********Display()****");
	    
	    s1.display();
	    s2.display();
	    
	
	}
 	
  
}
