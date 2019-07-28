package youtube;

public class ReverseHalfCharInString {

	public static void main(String[] args) {
		String name="manikanta";
		String rev=" ";
		Long no=7878l;
		float length=name.length();
		System.out.println(length/2);
		
		char[] nameArr=name.toCharArray();
		
		
		if(length%2==0) {
			for(int i=(int)length/2;i<=length-1;i++) {
				rev=rev+nameArr[i];
			}
			for(int i=0;i<length/2;i++) {
				rev=rev+nameArr[i];	
			}
			
			
		}else {
			
				for(int i=(int)length/2;i<=length-1;i++) {
					rev=rev+nameArr[i];
				}
			
			
			
			
		}
		System.out.println(rev);
		

	}//main

}//class
