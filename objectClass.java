package Revison;

public class objectClass {
	public static void main(String [] args)
	{
		Object o=new Object();
		throw o; 
		// no exception of type object can be thrown;
		// an exception type must be a subclass of throwable 
	}
}
