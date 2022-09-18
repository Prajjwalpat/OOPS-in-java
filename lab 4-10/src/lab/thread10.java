package lab;
import java.lang.Math; 
class ranthread extends Thread{
	ranthread(){
		start();
	}
	
	public void run() 
	{
		try 
		{
			for(int i = 5; i > 0; i--) 
			{
				System.out.println("Random Number: " + Math.random()); 
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("random interrupted");
		}

		System.out.println("Exiting random thread.");
	}
}
class sqthread extends Thread{
	sqthread(){
		start();
	}
	
	public void run() 
	{
		 
		
			System.out.println("square of 5 is"+5*5);
		
		

		System.out.println("Exiting sq thread.");
	}
}
class cubthread extends Thread{
	cubthread(){
		start();
	}
	
	public void run() 
	{
		 
		
			System.out.println("cube of 5 is"+5*5*5);
		
		

		System.out.println("Exiting cube thread.");
	}
}


public class thread10 {

	public static void main(String[] args) {
	    ranthread t1=new ranthread();
		sqthread t2=new sqthread();
		cubthread t3=new cubthread();

	}

}
