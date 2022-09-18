package lab;

interface test{
	public void square();
}

class arithmetic implements test{
	public void square() {
		System.out.println("interface fucntion implemented");
	}
}
class ToTestInt extends arithmetic{
	public void square() {
		System.out.println("totestint impleneted");
	}
}

public class interf {

	public static void main(String[] args) {
		arithmetic ob1=new arithmetic();
		ToTestInt ob2=new ToTestInt();
		ob1=ob2;
		ob1.square();
		

	}

}
