package accesspack;

public class Accessspecifier {

	public void publicmethod()
	{
		System.out.println("This is public method");
	}
	
	private void privatemethod()
	{
		System.out.println("This is private method");
	}
	protected void protectmethod()
	{
		System.out.println("Protected method");
	}
	void defaultmethod()
	{
		System.out.println("This is DEfault method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accessspecifier ob=new Accessspecifier();
		ob.publicmethod();
		ob.defaultmethod();
		ob.privatemethod();
		ob.protectmethod();
	}

}
