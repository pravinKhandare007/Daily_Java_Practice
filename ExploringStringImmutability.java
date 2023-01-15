package daily.misselenious;

public class ExploringStringImmutability {
	public static void main(String[] args) {
		String s1 = new String("the first String");
		String s2 = new String("the second string");
		
		s1.concat(s2);
		//the above statement will not change s1 it will return new string
		String s3 = s1;
		
		//if we assign s1 with the new string then it feels like s1 has changed 
		//but its the same in the string pool 
		
		s1 = s1.concat(s2);//does this create a new string in the string pool
		
		System.out.println(s1);
		System.out.println(s1.concat(s2));
		System.out.println("printing s3 which points towards s1 memeory location");
		System.out.println(s3);
	}
}
