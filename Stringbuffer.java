import java.lang.*;
import java.util.Scanner;
class Stringbuffer
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the string (without spaces) : ");
		String str = sc.nextLine();
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(" intial string : "+sbf);
		sbf.delete(2,5);
		System.out.println(" -- after deleting characters from index 2 to 5 -- \n the final string : "+sbf);
	}
}