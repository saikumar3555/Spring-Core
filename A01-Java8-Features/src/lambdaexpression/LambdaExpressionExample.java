package lambdaexpression;


public class LambdaExpressionExample {
	

	public static void main(String[] args) {
		Drawable d=new Drawable() {
			public void draw() {
				System.out.println("Method implemented");
			}
		};
		d.draw();

	}

}
