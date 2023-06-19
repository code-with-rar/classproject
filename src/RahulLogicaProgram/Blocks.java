package RahulLogicaProgram;

public class Blocks {
	 static  int age;
	   double salary;
	   
	 {
		System.out.println("running static block -1 of class blocks");
		 salary=45000.23;
	}
	 static {
		 System.out.println("running static block -2 of class blocks");
		 age=26;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() start...");
		Blocks b1= new Blocks();
		
		System.out.println(" I am main static blSock -1 of class blocks"+Blocks.age);
		System.out.println("main() middle..");
		Blocks b2= new Blocks();
		Blocks b3= new Blocks();
		System.out.println("main() End..");
		System.out.println(" I am main static blSock -1 of class blocks"+b1  .salary);
		
				
	}
	
	

}
