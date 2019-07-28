package youtube;
//program for reverse an array with out createing new Array

import java.util.Arrays;

public class ReverseAnArray_WithOut_NewArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		reverse(a);

	}//main
	public static void reverse(int[] a) {
		
		int start=0;
		int last=a.length-1;
		int temp=0;
		int middle=a.length/2;
		for(;start<middle;start++,last--) {
			
			
	temp=a[start];
	a[start]=a[last];
	a[last]=temp;
		}//for
	
	System.out.println(Arrays.toString(a));
		
	}//reverse
	
	

}//class
