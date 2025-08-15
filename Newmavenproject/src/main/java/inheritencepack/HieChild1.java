package inheritencepack;

public class HieChild1 extends HieParent{

	
	public void show()
	{
		String e="Child a";
		System.out.println(e);
	}
	
	public static void main(String[] args)
	{
		HieChild1 hc1=new HieChild1();
		hc1.show();
		hc1.display2("Parent class");
		
		
		
	}
	
}
