package youtube;

import java.util.Scanner;

/*Write  a java program to read a string and character from keyboard.
 *Then replace character position in string with character occurance.
 *    Input : Deloitte
      character : t
      output : Deloi12e

     Input 1 : OPENTEXT
     Input 2 : T
     Output : OPEN1EX2
 */
public class ReplaceCharInAStringWithCharCount {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a String");
     String name= s.nextLine();
     System.out.println("Enter a Charevter");
     char c=s.next().charAt(0);
		//String name = "Deloitte";
       // char c = 't'
		int count = 1;
		String result = " ";
		;
		char[] charArr = name.toCharArray();
		for (char ch : charArr) {
			if (ch == c) {
				result = result + count;
				count++;
			} else {
				result = result + ch;
			}
		} // for
       System.out.println(result);
	}// main

}// class
