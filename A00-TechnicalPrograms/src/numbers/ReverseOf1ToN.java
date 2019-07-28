package numbers;

import java.util.Scanner;

public class ReverseOf1ToN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println();
		
		int inputNumber =s.nextInt();
		if(inputNumber>0) {
		for(int i=inputNumber;i>=0;i--) {
			System.out.println(i);
		}
		}else {
			System.out.println("Enter NonZero PositiveNumber");
	

	}

}
}
