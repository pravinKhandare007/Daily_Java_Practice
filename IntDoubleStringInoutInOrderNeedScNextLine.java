package daily.misselenious;

import java.util.Scanner;

public class IntDoubleStringInoutInOrderNeedScNextLine {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
     double y = sc.nextDouble();
     System.out.println("enter string"); 
     //below statement if not given the string input is skipped
     sc.nextLine();
     String s =sc.nextLine();
        
        sc.close();
    System.out.println("String: " + s);
    System.out.println("Double: " + y);
    System.out.println("Int: " + x);
	}
}
