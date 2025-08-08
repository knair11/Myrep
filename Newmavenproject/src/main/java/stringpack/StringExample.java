package stringpack;

public class StringExample {
	public static void main(String[] args)
	{
		String s="Keerthana";
		System.out.println(s);
		String s1=new String("Hello");
		System.out.println(s1);
		//char to return character into string at index position
		System.out.println(s.charAt(5));
		//length to return size of the string
		System.out.println(s.length());
		//add two strings
		System.out.println(s.concat(s1));
		//contains to check whether a character/word is present
		System.out.println(s.contains("you"));
		System.out.println(s1.contains(s));
		System.out.println(s.contains("kee"));
		//to upper case
		System.out.println(s.toUpperCase());
		//to lower case
		System.out.println(s.toLowerCase());
		//equal to compare if 2 strings are equal
		System.out.println(s.equals(s1));
		String a="java";
		String b="java";
		String c="Java";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		//equal Ignore case
		System.out.println(a.equalsIgnoreCase(c));
		String d=new String("java");
		System.out.println(a.equals(d));
		System.out.println(a==c);
		//isEmpty
		System.out.println(a.isEmpty());
		String e=" ";
		System.out.println(e.isEmpty());
		//value of
		int f=25;
		System.out.println(String.valueOf(f));
		
	}

}
