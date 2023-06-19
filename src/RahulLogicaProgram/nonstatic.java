package RahulLogicaProgram;

public class nonstatic {
	 //glbal variable
	int mobileno=123;
	 char grade;
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("programm start");
		System.out.println("***********");
		nonstatic r1=new nonstatic();
		System.out.println("mobile with r1 refernce"+r1.mobileno);
		System.out.println("mobile with r1 refernce"+r1.grade);
		System.out.println("************");
				
	  nonstatic x1=new nonstatic();
		System.out.println("mobile with r1 refernce"+x1.mobileno);
		System.out.println("mobile with r1 refernce"+x1.grade);
		System.out.println("************");
	     x1.mobileno=987;
	     x1.grade='a';
	     System.out.println("mobile with r1 refernce"+x1.mobileno);
		System.out.println("mobile with r1 refernce"+x1.grade);
		System.out.println("************");
	     
	}

}
