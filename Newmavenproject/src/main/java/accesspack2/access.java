package accesspack2;

import accesspack.Accessspecifier;

public class access extends Accessspecifier {
	public static void main(String[] args)
	{
		access ob1=new access();
		ob1.protectmethod();
		ob1.publicmethod();
		//ob.defaultmethod();
		//ob.privatemethod(); not visible
		Accessspecifier ob=new Accessspecifier();
		ob.publicmethod();
		
	}

}
