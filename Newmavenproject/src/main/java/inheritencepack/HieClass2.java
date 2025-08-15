package inheritencepack;

public class HieClass2 extends HieParent {
	
	
	public void display(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args)
	{
		HieClass2 hc2=new HieClass2();
		hc2.display("Child2");
		hc2.display2("Parent class");
	}

}
