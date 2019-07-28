package lambdaexpression;

public class GreetingLamdbsExp {
	
	public static void main(String[] args) {
		Greeting g=()->{ return "Om Swamiye saranam Ayyappa";};
		String s=g.wish();
		System.out.println(s);
	}


}
