import java.util.Arrays;
import java.util.Scanner;
public class Logic {
	public static int sum(int n)
	{
	int sum=0,rem;
	while(n!=0)
	{
	rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
	if(sum<9)
	return sum;
	else
		while(sum>9)
		{
			sum=sum(sum);
		}
	return sum;
	}
		public static void main(String[] args) {	
			Scanner sc=new Scanner(System.in);
			 String str=sc.nextLine();
			 int n=Integer.parseInt(str.replaceAll("[\\D]", ""));
		     int l=(int)(Math.log10(n)+1);
		     int rem=0;
		     int a[]=new int[l];
             for(int j=0;j<l;j++)
             {
            	 for(int i=0;n!=0;i++)
            	 {
            		 rem=n%10;
            		 a[i]=rem;
            		 n=n/10;
            	 }
             }
             Arrays.sort(a);
             int s=a[0];
             int g=a[l-1];
             int A=0;
             for(int i=0;i<l;i++)
             {
            	 A=A+(g*a[i]);
             }
             int sum1=sum(A);
             int B=1;
             for(int i=0;i<l;i++)
             {
            	 B=B*(s+a[i]);
             }
             int sum2=sum(B);
             int res=0;
             if(sum1<sum2)
            	 res=sum1*sum1;
             else
            	 res=sum2*sum2;
             System.out.println(res);
		}
	}