package lab;
import java.io.*;
public class checkedexc extends Thread{

	Thread th;
	public checkedexc() 
	{
		th = new Thread(this);
		th.start();
	}
	public void run()
	{
		try 
		{
		th.sleep(1000);
		System.out.println("This is code will run because we have put it in a try and catch");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
   
	public static void main(String args[])
	{
		new checkedexc();
	}
}