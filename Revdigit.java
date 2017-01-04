import java.util.Arrays;
import java.util.Scanner;

public class Revdigit {
	public static String rev(String str)
	{
		String rev=new StringBuffer(str).reverse().toString();
		return rev;
	}
		public static void main(String[] args) {	
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 String st=n+"";
			 st=rev(st);
			 int d=Integer.parseInt(st);
			 System.out.println("The reverse is: " +d);
			 
			}
	}