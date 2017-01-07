import java.util.Scanner;

public class Encode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int n=10;
		int l=str.length();
		String sm=str1;
		String st="abcdefghijklmnopqrstuvwxyz";
		char ch[]=str.toCharArray();
		str1=str1.substring(1,sm.length()-1);
		int l1=str1.length();
		char ch1[]=str1.toCharArray();
		String ns="";
		String sn="";
		for(int i=0;i<l;i++)
		{
			int s=(st.indexOf(ch[i]))+n;
			if(s>25)
				s=s%26;
			ns+=st.charAt(s);
		}
		for(int i=0;i<l1;i++)
		{
			int s=(st.indexOf(ch1[i]))+n;
			if(s>25)
				s=s%26;
			sn+=st.charAt(s);
		}
		sn=sm.charAt(0)+sn+sm.charAt(sm.length()-1);
		System.out.println(ns+" " +sn);
	}

}
