import java.util.Arrays;
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {	
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 int b[]=new int[n];
		 int c=0;
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		 for(int i=0;i<n-1;i++)
		 {
		 if(a[i]==a[i+1]){
			 b[c]=a[i];
		 c++;
		 } 
		 }
		 if(c==0)
			 System.out.println("No repeated numbers");
		 for(int i=0;i<c;i++)
		 {
			 System.out.println(b[i]);
		 }
		 }
}