package lab;

public class tandc {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=30;
			int err = b/a;
			
			try
			{
				throw new Exception("Panav mar gya");
			}
			finally {
				System.out.println("panav achha aadmi tha");
			}
		}
		catch(Exception r)
		{
			System.out.println(r);
		}

	}

}
