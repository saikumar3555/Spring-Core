package youtube;
import java.util.Arrays;
public class Anagram_Approch1 {

	public static boolean checkStringIsAnagramOrNot(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				return true;
			} else {
				return false;
			}
		} // else

	}// method

	public static void main(String[] args) {

		String s1 = "sair";
		String s2 = "iase";
		boolean res = checkStringIsAnagramOrNot(s1, s2);
		if (res) {
			System.out.println("Given Strings are Anagrams");
		} else {
			System.out.println("Given Strings are not Anagrams");
		}

	}// main

}// class
