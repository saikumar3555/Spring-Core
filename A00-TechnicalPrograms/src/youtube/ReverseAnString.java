package youtube;

public class ReverseAnString {

	public static void main(String[] args) {
		String name="Java";
		System.out.println("before Reverse A string:: "+name);
		String  rev="";
		char[] charArr=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			char ch=charArr[i];
			
			rev=rev+ch;
		}
		
		System.out.println("After Reverse A string:: "+rev);
	}//main

}
