package lab;
import java.util.*;

class dog{
	public void bark() {
		System.out.println("bhobho");
	}
	public void bark(int n) {         //overloading
		for(int i=0;i<n;i++) {
			System.out.println("bho");
		}
	}
}
class dobberman extends dog{   
	public void sniff() {             //overriding
		System.out.println("sniff");
	}
}

public class lab4 {
	
	
	public lab4()
	{
		System.out.println("hi");
		dog panav=new dog();
		panav.bark();
		panav.bark(5);
		dobberman kishna=new dobberman();
		kishna.bark();
		kishna.sniff();
			
	}

	public static void main(String[] args) {
	    new lab4();
		}

	}


