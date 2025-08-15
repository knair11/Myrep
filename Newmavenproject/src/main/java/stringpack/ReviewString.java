package stringpack;

public class ReviewString {
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("hello");
		System.out.println(s);
		s.insert(3,"-");
		System.out.println(s);
		s.append("World");
		System.out.println(s);
		s.replace(0, 2, "hi");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.delete(0, 3);
		System.out.println(s);
		
	}

}
