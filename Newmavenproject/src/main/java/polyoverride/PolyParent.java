package polyoverride;

public class PolyParent {
	
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	public void diff()
	{
	 int a=17;
	 int b=8;
	 int c=a-b;
	 System.out.println("Diff is "+c);
	 
	}
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Mult is "+c);
	}

}
