package daily.misselenious;

import java.util.Scanner;

public class Palindrome {
	public void palindrome(String in) {
		char[] s = in.toCharArray();
		char[] revs= new char[s.length];
		for(int i=0; i<s.length;i++) {
			revs[i] = s[s.length-1-i];
		}
		String rs = new String(revs);
	boolean is = in.equals(rs);
	System.out.println(in);
	System.out.println(rs);
	System.out.println(is);
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the string");
//		String input = sc.nextLine();
		String input = "abba";
		Palindrome pl = new Palindrome();
		pl.palindrome(input);
	}
}
