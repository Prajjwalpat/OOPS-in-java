package lab;
import java.util.*;

class doggie{
	public void bark() {
		System.out.println("bhobho");
	}
	public void bark(int n) {         //overloading
		for(int i=0;i<n;i++) {
			System.out.println("bho");
		}
	}
}
class dobbermann extends doggie{   
	public void sniff() {             //overriding
		System.out.println("sniff");
	}
}
class rotweiler extends doggie{
	void age() {
		System.out.println(10);
	}
}
class food extends dobbermann{
	void dogfood() {
		System.out.println("pedigree");
	}
}

public class lab5 {

	public static void main(String[] args) {
		dog panav=new dog();
		panav.bark();
		panav.bark(5);
		dobberman kishna=new dobberman();
		kishna.bark();
		kishna.sniff();
		food dbm = new food();
		dbm.dogfood();
		}

	}