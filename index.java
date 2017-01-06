import java.util.Scanner;
public class index 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="maths123";
		String s1="123";
			if(s.contains(s1))
			{
				int d=s.indexOf(s1);
				System.out.println(d);
			}
			else
			{
				System.out.println("-1");
			}
		}
	
}