package polyoverride;

public class PolyChild extends PolyParent {
	
	public void sum(int a,int b)
	{
		super.sum(3, 8);
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	public void diff()
	{
     super.diff();
	 int a=8;
	 int b=4;
	 int c=a-b;
	 System.out.println("Diff is "+c);
	 
	}
	

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		super.mul(8, 8);
		int c=a*b;
		System.out.println("Mult is "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolyChild ob=new PolyChild();
		ob.sum(3, 4);
		ob.diff();
		ob.mul(7, 9);
	}

}
