package inheritencepack;

public class MultilevelChild extends Multilevelinter {
	
	public void show(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args)
	{
		 MultilevelChild ml=new MultilevelChild();
		 ml.display("intermittent class");
		 ml.sum(9,8);
		 ml.show("Child class");
	}
}
