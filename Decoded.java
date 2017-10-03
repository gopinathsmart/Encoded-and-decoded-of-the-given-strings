package program;

import java.util.Scanner;

public class Decoded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String s1=in.next();
		System.out.println("Enter the String 2:");
		String s2=in.next();
		System.out.println("Enter the String 3:");
		String s3=in.next();
		int c=0;
		int c1=0;
		int c2=0;
		int c3=0;
		int a[]=new int[3];
		System.out.println("Enter the length of original strings");
		for(int i=0;i<3;i++) {
			a[i]=in.nextInt();
		}
		String s4="";
		String out1="";
		String out2="";
		String out3="";
		for(int i=0;i<s3.length();i++) {
			if(Character.isLowerCase(s3.charAt(i))) {
				s4+=Character.toUpperCase(s3.charAt(i));
			}
			else {
				s4+=Character.toUpperCase(s3.charAt(i));
			}
		}
		for(int j=0;j<3;j++) {
			c=a[j]/3;
			if(a[j]%3==0) {
				c1=c;
				c2=c;
				c3=c;
			}else if(a[j]%3==1) {
				c1=c;
				c2=c+1;
				c3=c;
			}else if(a[j]%3==2) {
				c1=c+1;
				c2=c;
				c3=c+1;
			}
			if(j==0) {
				
				out1=out1+s1.substring(0,c1);
				s1=s1.substring(c1);
				out1=out1+s2.substring(0,c2);
				s2=s2.substring(c2);
				out1=out1+s4.substring(0,c3);
				s4=s4.substring(c3);
				
			}else if(j==1) {
				
				out2=out2+s4.substring(0,c1);
				s4=s4.substring(c1);
				out2=out2+s1.substring(0,c2);
				s1=s1.substring(c2);
				out2=out2+s2.substring(0,c3);
				s2=s2.substring(c3);
			}else if(j==2) {
				
				out3=out3+s2.substring(0,c1);
				s2=s2.substring(c1);
				out3=out3+s4.substring(0,c2);
				s4=s4.substring(c2);
				out3=out3+s1.substring(0,c3);
				s1=s1.substring(c3);
			}
		
		}System.out.println("decoded output");
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);
	}

}
