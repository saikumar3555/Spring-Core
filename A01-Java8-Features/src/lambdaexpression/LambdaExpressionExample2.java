package lambdaexpression;

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		
		
		Drawable dw=()->{
			System.out.println("using iambda expression");
		};
		dw.draw();
	}

}
