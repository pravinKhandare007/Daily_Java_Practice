package daily.misselenious;

import java.util.Iterator;

public class PrintingArrayAndCharArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		String[] st_arr = new String[10];
		String at = "wow";
		arr[0]=10;
		arr[1]=10;
		System.out.println(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(st_arr);
	
		byte[] bt = at.getBytes();
		for(int i =0;i<bt.length;i++) {
			System.out.println(bt[i]);
		}
		System.out.println(bt);
	
	
	}
}
