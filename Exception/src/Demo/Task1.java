package Demo;

public class Task1 {
	public static void main(String[] args) {
		try
		{
			String s1=args[0];//BBB
			System.out.println(s1.charAt(4));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}

}
