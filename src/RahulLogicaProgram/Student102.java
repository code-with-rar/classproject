package RahulLogicaProgram;

class Student102 {
	 int rollno;
     float fee;
   Student102(int rollno)
     {
       this.rollno= rollno;
     }
   Student102(int rollno , float fee)
       { 
     	  this(rollno);
     	  this.fee= fee;
       }  
     	 void display( ) 
     	 {
     	System.out.println(rollno +" "+fee);
     	 }
     	
}
	class ThisStatement4 {    
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student102 s1 = new Student102(111);
       Student102 s2 = new Student102(111,6000f);
       
       s1.display();
       s2.display();
       System.out.println("Program end");
       
       
       
		
	}


}
