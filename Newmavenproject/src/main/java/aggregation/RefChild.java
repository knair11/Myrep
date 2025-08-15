package aggregation;

public class RefChild {
	
	String sr;
	int i;
	RefParent ref;

	public RefChild(String sr,int i,RefParent ref)
	{
		this.sr=sr;
		this.i=i;
		this.ref=ref;
	}
	
	public void show()
	{
		System.out.println(sr+" "+i);
		System.out.println(ref.s+" "+ref.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	RefParent ob1=new RefParent("Hllo",65);
RefChild ob=new RefChild("Sreyyyyuu",34,ob1);
ob.show();
	}

}
