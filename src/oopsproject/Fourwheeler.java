package oopsproject;

public  class Fourwheeler {
	
	public void wheels() {
		System .out.println(" I have a 4 wheeler ");
	}
	}
  class car extends Fourwheeler {
	  
	  public void type() {
		  System.out.println(" I'm a car ");
	  }
	  }
class maruti extends car {
	  
	  public void company() {
		  System.out.println(" I'm a maruti ");
	  }
	  }
   class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maruti fr = new maruti();
		
		fr.wheels();
		fr.type();
		fr.company();
		
		
	}

}
