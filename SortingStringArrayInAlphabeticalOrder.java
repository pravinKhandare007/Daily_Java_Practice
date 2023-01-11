package daily.misselenious;

public class SortingStringArrayInAlphabeticalOrder {
	
	public boolean intToBoolean(int i) {
		boolean var =true;
		if(i>0) var = true;
		if(i==0) var =false;
		if(i < 0) var = false;
		return var;
	}
	
	public String[] sortString(String[] stringArray) {
		
		for(int i=0;i<stringArray.length-1;i++) {
			for(int j =0; j< stringArray.length -1-i;j++) {
				if(intToBoolean(stringArray[j].compareTo(stringArray[j+1]))) {
					String storingIntermidiate = stringArray[j];
					stringArray[j]=stringArray[j+1];
					stringArray[j+1]=storingIntermidiate;
				}
			}
		}
		
		
		return null;
	}
	
//	public void seapString(String[] stringArray) {
//		String stroingIntermidiate = arrayOfString[i];
//		arrayOfString[i]=arrayOfString[i+1];
//		arrayOfString[i+1]=storingIntermidiate;
//	}
	
	public static void main(String[] args) {
		SortingStringArrayInAlphabeticalOrder stringSorterOBJ = new SortingStringArrayInAlphabeticalOrder();
		String[] arrayOfStrings = {"babysit","backhand","backchat","backhander","zeppa"};
		stringSorterOBJ.sortString(arrayOfStrings);
		
		//printing array
		for(int i=0;i<arrayOfStrings.length;i++) {
			System.out.print(arrayOfStrings[i]);
			System.out.print(" ");
		}
	}
}
