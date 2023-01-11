package daily.misselenious;

import java.util.Scanner;

public class StringInputFromKeyboard {
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
//		int i = sc.nextInt();
//		System.out.println(i);
//		double d = 45.00;
//		System.out.println(d);
//		System.out.println("enter another number");
//		int s = sc.nextInt();
//		System.out.println(s);
//		System.out.println("enter a string now ");
//		String st = sc.nextLine();
//		System.out.println(st);
////		System.out.println("enter your string");
////		String s = sc.nextLine();
////		System.out.println(s);
////		System.out.println("s didnt print did it");
//		//System.out.println(i);
//		sc.close();
//		sc2.close();
		
		//----------------------------------------------------------
		
		  // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // String input
        
 
        // Character input
        char gender = sc.next().charAt(0);
 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("");
        double cgpa = sc.nextDouble();
 
        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
	}
}
