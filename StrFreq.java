import java.util.Arrays;
import java.util.Scanner;

public class StrFreq {
		public static void main(String[] args) {	
			 Scanner sc=new Scanner(System.in);
			 int a[]=new int[100];
			 String str=sc.nextLine();
			 String st=str.replaceAll("[abcdefghijklmnopqrstuvwxyz]", " ");
			 String st1=str.replaceAll("[1234567890]", "");
			 String[] ss=st.split(" ");
			 char ch[]=st1.toCharArray();
			 String res[]=new String[st1.length()];
			 String nn="";
			 for(int i=0;i<res.length;i++)
			 {
				 int tem=Integer.parseInt(ss[i+1]);
				 String ns="";
				 for(int j=0;j<tem;j++)
				 {
					 ns=ns+ch[i];
				 }
				 nn=nn+ns;
			 }
			System.out.println(nn); 
		}
	}