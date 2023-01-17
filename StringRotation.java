package daily.string;

public class StringRotation {
	
	public String rotateString(String s) {
		char[] charArrayOfString = s.toCharArray();
		char firstCharecter = charArrayOfString[0];
		for(int i =0; i < charArrayOfString.length;i++ ) {
			charArrayOfString[i] = charArrayOfString[i+1];
		}
		return rotatedString;
	}

	public static void main(String[] args) {
		String taget = "cdeab";
		String input = "abcde";
		
		StringRotation cs = new StringRotation();
		String rotatedString = cs.rotateString(input);
		

	}

}
