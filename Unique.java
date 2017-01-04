import java.util.Arrays;
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {	
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 int c=0;
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int temp=0;
		 Arrays.sort(a);
		 for(int i=0;i<=n/2;i=i+2)
		 {
			if(a[i]==a[i+1])
				c++;
			if(a[i]!=a[i+1]) 
				temp=a[i];
		 }
		 if(c==n/2)
		 System.out.println(a[n-1]);
		 else if(c==0)
			 System.out.println(a[0]);
		 else
			 System.out.println(temp);
		 }
}
