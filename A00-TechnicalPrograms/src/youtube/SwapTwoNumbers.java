package youtube;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x=10,y=20;
		System.out.println("before swapping X:"+x+" y:"+y);
		//logic for swapping
		x=x+y;   //x=10+20=30
		y=x-y;    //y=30-20=10
		x=x-y;    //x=30-10=20
		System.out.println("After swapping X:"+x+" y:"+y);

	}

}
