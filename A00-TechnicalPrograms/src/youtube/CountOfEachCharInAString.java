package youtube;

import java.util.HashMap;

public class CountOfEachCharInAString {

	public static void main(String[] args) {
	String word="Hello";
	
	HashMap<Character,Integer> map=new HashMap<>();
	
	char[] charArr=word.toCharArray();
	for(char ch :charArr) {
		if(!map.containsKey(ch)) {
			map.put(ch, 1);
		}else {
			int valueCount=map.get(ch);
			map.put(ch,valueCount+1);
		}//else
		
		
	}//for
   System.out.println(map);
	}//main

}//class
