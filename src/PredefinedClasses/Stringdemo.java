package PredefinedClasses;

public class Stringdemo {

	public static void main(String[] args)
	{
		/*Stringdemo s1= new Stringdemo ();
		System.out.println("s1:is "+s1);
		
		String s2 = new String ("pune is IT hub");
		System.out.println("s2:is "+s2.toString());
		
		String str="Pune"+1536;
		System.out.println(str);
		String str1=str.concat(null);//Null Pointer Exception
		System.out.println(str1);
		*/
		String s1="I am from UP";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s2="I am from UP";
		System.out.println("Actual String: "+s2);
		String[] strAry2=s2.split(" ", 2);
		for(String s:strAry2) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s3="IamfromPune";
		System.out.println("Actual String: "+s3);
		String str[]=s3.split(" ");
		String temp="";
//		for(String s:str) {
//			System.out.println(s);
//		}
		for(int i=str.length-1;i>=0;i--) {
			temp=temp+" "+str[i];
			System.out.println("reverse statement: "+str.length);
	
			System.out.println("reverse statement: "+s3.length());
		
			
		}
		
		System.out.println("***************************");
		String s4="     I am shailesh         ";
		System.out.println("Actual String with spaces: "+s4);
		System.out.println("Actual String length: "+s4.length());
		System.out.println("Actual String without spaces: "+s4.trim());
		System.out.println("Actual String length without spaces: "+s4.trim().length());
		System.out.println("***************************");
		String s5="I    am             shailesh";
		System.out.println("Actual String with spaces: "+s5);
		System.out.println("Actual String length: "+s5.length());
		
		String s8="gf";
		System.out.println("r"+reverseString("gf"));
		
	
	}

	private static char[] reverseString(String s4) {
		// TODO Auto-generated method stub
		return null;
		
	}

}

