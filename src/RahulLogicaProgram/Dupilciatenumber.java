package RahulLogicaProgram;

import java.util.Set;
import java.util.HashSet;

public class Dupilciatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int[] arr= {2,3,3,6,6,8,8,9};
		
			Set<Integer> s= new HashSet<>();
		
		for(int no:arr)
		{
			  if(s.add(no)==false)
			  {
				  System.out.println("The no is Duplicate "+no);
			  }
		}
		
	}

}
