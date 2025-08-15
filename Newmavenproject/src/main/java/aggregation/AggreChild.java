package aggregation;

public class AggreChild {
	
	String sub;
	int rollno;
	AggreParent ref;//aggregation

	public AggreChild(String sub, int rollno,AggreParent ref)
	{
		
		this.sub=sub;
		this.rollno=rollno;
		this.ref=ref;
		
	}
	
	public void display()
	{
		System.out.println(sub+" "+rollno);
		System.out.println(ref.name+" "+ref.marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreParent ob1=new AggreParent("Sreyu",80);
		AggreChild ob=new AggreChild("Maths",50,ob1);
		ob.display();

	}

}
