import java.util.Arrays;
import java.util.Scanner;

public class Fourth {
		public static void main(String[] args) {	
			 Scanner sc=new Scanner(System.in);
			 int a[]=new int[50];
			 System.out.println("Enter k: ");
			 int k=sc.nextInt();
			 for(int i=0;i<50;i++)
			 {
				 a[i]=sc.nextInt();
			 }
			 Arrays.sort(a);
			 System.out.println("The 4th element is: " +a[3]);
			 System.out.println("The" +k +" th element is: " +a[k-1]);
		}
	}