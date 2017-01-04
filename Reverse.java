import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
public static String rev(String str)
{
	String rev=new StringBuffer(str).reverse().toString();
	return rev;
}
	public static void main(String[] args) {	
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 System.out.println("The reverse is: " +rev(str));
		 
		}
}