package stringpack;

public class Builder_buffer {
	
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hello");
	System.out.println(sb);
	//insert-to insert new element into string
	sb.insert(5,"-");
	System.out.println(sb);
	//append-add new string o last
	sb.append("World");
	System.out.println(sb);
	//replace-to replace a particular string based on index
	sb.replace(0, 6, "!!");
	System.out.println(sb);
	//reverse-to reverse a string
	sb.reverse();
	System.out.println(sb);
	//delete-to delete based on index
	sb.delete(0, 3);
	System.out.println(sb);
}


}
