import java.util.Arrays;
import java.util.Scanner;

public class Closes {

	public static void main(String[] args) {	
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 int temp=0;
		 int k,h;
		 int c=0;
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				temp=a[i]+a[j];
				c++;
				if(temp==-1 || temp==1)
					System.out.println("The elements are " +a[i] +" " +a[j]);
			}
		}
		
		}
}