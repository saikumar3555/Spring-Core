package youtube;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArrayByJava8 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		reverse(a);

	}//main
	public static void reverse(int[] a) {
		
	Object[] revArr=	IntStream.rangeClosed(1,a.length)
		               .mapToObj(i->a[a.length-i])
		               .toArray();
		System.out.println(Arrays.toString(revArr));
	}

}
