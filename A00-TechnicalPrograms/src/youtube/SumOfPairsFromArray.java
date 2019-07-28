package youtube;

/*Write a java program to read below 2 inputs

i) read values for integer array : 
		10,2,5,8,-1,3,4

ii) read one number
		7

Write logic to identify number pairs in array which will give sum as input number(i.e 7).

2+5 = 7  === 2,5
8-1 = 7  === 8,-1
3+4 = 7  === 3,4*/

public class SumOfPairsFromArray {

	public static void main(String[] args) {
		int numbersArr[]= {10,2,5,8,-1,3,4};
		int sum=7;
		
		for(int n1:numbersArr) {
			for(int n2:numbersArr) {
				int res=n1+n2;
				if(res==sum) {
					System.out.println(n1+" "+n2);
				}
			}//innner for
			
		}//outer for

	}//main

}//class
