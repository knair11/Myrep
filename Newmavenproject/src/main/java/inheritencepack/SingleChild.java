package inheritencepack;

public class SingleChild extends SingleParent {
	public void diff(int a,int b)
	{
		int c=a-b;
		System.out.println("Diff is "+c);
	}
	
public static void main(String[] args)
{
	SingleChild sc=new SingleChild();
	sc.diff(7, 4);
	sc.sum(8, 2);
	
}
}
