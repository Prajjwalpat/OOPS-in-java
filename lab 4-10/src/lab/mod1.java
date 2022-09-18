package lab;				// Searching of Strings- Char or a string	
												
class NewException extends Exception
{
	public NewException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}
												//		indexOf("str", strtIndex)				--> First Occurance
													//		lastIndexOf("str", strtIndex)		--> Last Occurance

public class mod1 {

	//package Module4;

//	public class Excep5 {

	static String arr[] = { "Now", "is", "the", "Time", "for", "all", "good", "men", 
			"to", "come", "to", "the", "aid", "of", "their", "country"};

public static void main(String args[]) 				// ABCDEFGHIJKLMNOPQRSTUVWXYZ
{
for(int j = 0; j < arr.length; j++) 
{
for(int i = j + 1; i < arr.length; i++) 
{
if(arr[i].compareTo(arr[j]) < 0) 		// < 0 The invoking string is less than str.
																// = The two strings are equal
																// > 0 The invoking string is greater than str
{
	String t = arr[j];
	arr[j] = arr[i];
	arr[i] = t;
}
}
System.out.println(arr[j]);
}
}

	

}