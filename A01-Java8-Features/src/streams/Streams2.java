package streams;

import java.awt.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Streams2 {
	public static void main(String[] args) {
		//1.Integer Stream
		IntStream
		.range(1, 10)
		.forEach((n)->System.out.println(n));
		//.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		//2.Interger Stream with skip
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		 
		//3.IntStream with sum
		
		int i=IntStream.range(2, 10).sum();
		System.out.println(i);
		
		//4.Stream with Filter
		String names[] = {"Saikumar","Rohan","Abdul","Shankar","Shali","Nadhiya"};
		Arrays.stream(names).filter(x->x.startsWith("S")).forEach((m)->System.out.println(m));
		
		/*
		 * if we use sorted() method it will return values with sorted order
		 * 
		 * 
		 */
		//4.Stream with map
		int numbers[] = {1,3,4,5,7,7,7,6};
		Arrays.stream(numbers).map(n->n*n).average().ifPresent(System.out::print);;
		//4.Stream from List filter and print
		
		java.util.List<String> goodNames = Arrays.asList("Saikumar","Shali","Rohan","Jaya","Siddu");
		goodNames.stream().map(String::toLowerCase).filter(m->m.startsWith("A")).forEach((name)->System.out.println(name));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
