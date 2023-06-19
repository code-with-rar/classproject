package RahulLogicaProgram;

public class swaonumber {

	
     public static void main(String[] args) {
		
		
		int a[] = {10,9,300,25};
		
		int max=0;
		int maxindex=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
		   {
			max=a[i];
			maxindex=i;
		   }  
		}
				System.out.println(max+"no is and index is"+maxindex);
				
		
		}
}


