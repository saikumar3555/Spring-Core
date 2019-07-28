package youtube;

public class ReverseEachWordOfAStrong {

	public static void main(String[] args) {
		String sentense="Hello World";
		System.out.println("before reverse :: "+sentense);
		String revSentense="";
		
		String[] wordsArr=sentense.split(" ");
		
		//this for loop for iterating each word from sentense
		for(String eachWord: wordsArr) {
			char[] charArr=eachWord.toCharArray();
			
			//this for loop for iterating ecah char from word
			for( int i=eachWord.length()-1; i>=0;i--) {
				char ch=charArr[i];
				revSentense=revSentense+ch;
				
			}//for
			revSentense=revSentense+" ";
		}//enhanced forloop
		System.out.println("after reverse :: "+revSentense);

	}//main

}//class
