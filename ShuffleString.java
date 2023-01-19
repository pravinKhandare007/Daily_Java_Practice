package daily.string;

public class ShuffleString {

	public static void main(String[] args) {
		String s1 = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		
		char[] s1CharArray = s1.toCharArray();
		
		//selection sort on indices
		//remember the smallest element index and swap 
		//or lets try bubble sort
		
		for(int i=0;i < indices.length;i++) {
			for(int j =0; j< indices.length - i ;j++) {
				if(indices[j]>indices[j+1]) {
					int remember = indices[j+1];
					indices[j+1] = indices[j];
					indices[j]= remember;
					
					char rememberCharecter = s1CharArray[j+1];
					s1CharArray[j+1] = s1CharArray[j];
					s1CharArray[j] = rememberCharecter;
				}
			}
		}
		
		String shuffledString = new String(s1CharArray);
		System.out.println(shuffledString);

	}

}
