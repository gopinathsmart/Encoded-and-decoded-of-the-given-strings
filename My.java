package program;

import java.util.ArrayList;
import java.util.Scanner;

public class My {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		String s[] = new String[3];
		String out1="";
		String out2="";
		String out3="";
		String out="";
		ArrayList<String>list=new ArrayList<String>();
int c=0;
System.out.println("Enter the Strings");
		for (int i = 0; i < 3; i++) {
			s[i] = in.next();
		}
		for(int i=0;i<3;i++) {
			if(s[i].length()%3==0) {
				c=s[i].length()/3;
			
				list.add(s[i].substring(0,c));
				s[i]=s[i].substring(c);
				list.add(s[i].substring(0,c));
				s[i]=s[i].substring(c);
				list.add(s[i].substring(0,c));
			}
			else if(s[i].length()%3==1) {
				c=s[i].length()/3;
			
				list.add(s[i].substring(0,c));
				s[i]=s[i].substring(c);
				list.add(s[i].substring(0,c+1));
				s[i]=s[i].substring(c+1);
				list.add(s[i].substring(0,c));
			}
			else if(s[i].length()%3==2) {
				c=s[i].length()/3;
			
				list.add(s[i].substring(0,c+1));
				s[i]=s[i].substring(c);
				list.add(s[i].substring(0,c));
				s[i]=s[i].substring(c+1);
				list.add(s[i].substring(0,c));
			}
		}
		out1=list.get(0)+list.get(4)+list.get(8);
		out2=list.get(1)+list.get(5)+list.get(6);
		out3=list.get(2)+list.get(3)+list.get(7);
		System.out.println("Encoded output");
		System.out.println(out1);
		System.out.println(out2);
		
		for(int i=0;i<out3.length();i++) {
			if(Character.isLowerCase(out3.charAt(i))) {
				out+=Character.toUpperCase(out3.charAt(i));
			}else {
				out+=Character.toLowerCase(out3.charAt(i));
			}
		}
		
		System.out.println(out);
	}

}
