package PredefinedClasses;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration
				int a[];
				//size initialization
				a = new int[5];
				
					//or
				float a1[]=new float[5];//declaration and instantiation  
				System.out.println(a1[0]);  
				System.out.println(a1[1]);  		
				System.out.println(a1[2]);  
				System.out.println(a1[3]);  
				System.out.println(a1[4]); 
				a1[0]=10;//initialization  
				a1[1]=20.2f;  
				a1[2]=70;  
				a1[3]=40;  
				a1[4]=50;  
				System.out.println("*************After initialization*************");
				System.out.println(a1[0]);  
				System.out.println(a1[1]);  
				System.out.println(a1[2]);  
				System.out.println(a1[3]);  
				System.out.println(a1[4]);
						//or
				System.out.println("Array Element counts: "+a1.length);//
				int[] getArray = { 10,20,30 };
				//or
	//int[] getArray2 ={ 10, 30, 50, 90, 60 };
	System.out.println("**************for-each loop----5*************");
	for(int num: getArray) {
		System.out.println(num);
	}

	}
}
