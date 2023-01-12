package daily.misselenious;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		char[] charArray = {'a','b','c'};
		String[] stringArray = {"can we print array without normal for loop without using arr[i]","awesome"};
		
		System.out.println("printing using enhanced for loop");
		for(char item: charArray) {
			System.out.print(item);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("now printing string array");
		for(String item : stringArray) {
			System.out.print(item);
			System.out.print(" ");
		}
	}

}
