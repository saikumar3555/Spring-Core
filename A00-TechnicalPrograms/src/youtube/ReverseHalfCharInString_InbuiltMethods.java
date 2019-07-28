package youtube;

public class ReverseHalfCharInString_InbuiltMethods {

	public static void main(String[] args) {
		String name="saik*umar";
		String rev="";
		
		int nameLength=name.length();
		if(nameLength%2==0) {
			rev=rev+name.substring(name.length()/2,name.length());
			rev=rev+name.substring(0,name.length()/2);
			
		}else {
			rev=rev+name.substring(nameLength/2+1, nameLength);
			rev=rev+name.charAt(nameLength/2);
			rev=rev+name.substring(0,nameLength/2);
		
			
		}
		
System.out.println(rev);
	}//main

}//class
