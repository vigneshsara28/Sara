import java.util.Arrays;
import java.util.Scanner;
public class Vowel {
		public static void main(String[] args) {	
			Scanner sc=new Scanner(System.in);
			 String str=sc.nextLine();
			 String rev=new StringBuffer(str).reverse().toString();
			String re=rev.replaceAll("[aeiouAEIOU]", "");
			 System.out.println(re);
		}
	}