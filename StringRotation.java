package daily.string;

public class StringRotation {
	
	public String rotateString(String s) {
		char[] charArrayOfString = s.toCharArray();
		char firstCharecter = charArrayOfString[0];
		for(int i =0; i < charArrayOfString.length - 1;i++ ) {
			charArrayOfString[i] = charArrayOfString[i+1];
		}
		charArrayOfString[charArrayOfString.length - 1]=firstCharecter;
		String rotatedString = new String(charArrayOfString);
		return rotatedString;
	}

	public static void main(String[] args) {
		String target = "cdeab";
		String input = "abcde";
		
		boolean areInputAndTargetEqualAfterRotation = false;
		StringRotation cs = new StringRotation();
		for(int i =0; i < input.length();i++) {
			input = cs.rotateString(input);
			System.out.println(input);
			if(target.equals(input)){
				areInputAndTargetEqualAfterRotation = true;
			}
		}
		
		

	}

}
