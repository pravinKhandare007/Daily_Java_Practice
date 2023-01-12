package daily.string;

public class StringPoolDemo {

	public static void main(String[] args) {
		String str1 = "string pool is yet to be explored";
		String str2 = "string pool is yet to be explored";

		if (str1 == str2) { // returns true
			System.out.println("== operater compares the address of objects so if this is "
					+ "showing on the screen that means the address of both str1 and str2 is " + "the same ");
		}

		// will create two seperate string objects with same value lets check
		String stObj1 = new String("do it");
		String stObj2 = new String("do it");

		System.out.println(stObj1 == stObj2); // returns false

		StringPoolDemo st = new StringPoolDemo();
		StringPoolDemo st2 = new StringPoolDemo();

		if (st == st2) {
			System.out.println("== operater compares the address of objects so if this is "
					+ "showing on the screen that means the address of both str1 and str2 is " + "the same ");
		}

		System.out.println(st == st2); // returns false

	}

}
