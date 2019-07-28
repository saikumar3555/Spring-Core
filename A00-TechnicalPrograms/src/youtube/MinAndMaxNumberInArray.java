package youtube;

public class MinAndMaxNumberInArray {

	public static void main(String[] args) {
		int numbers[]= {2,5,6,7,8,6,66,4,77};
		
		int max=numbers[0];
		int min=numbers[0];
		for(int number:numbers) {
			if(max<number) {
				max=number;
			}else {}
			if(min>number) {
				min=number;
			}
		}
		System.out.println("max::"+max);
		System.out.println("min::"+min);

	}//main

}//class
