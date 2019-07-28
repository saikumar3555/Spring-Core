package youtube;

import java.util.Arrays;

public class ReverseAnArrayWithNewArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		reverse(a);

	}//main
	
	public static void reverse(int[] arr) { 
		int j=0;
		//create new Array
		int[] b=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			b[j]=arr[i];
			j++;
		}//for
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
		
	}//reverse

}//class
