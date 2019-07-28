package diamond.problem;


 interface Car{
	default void drive() {
		System.out.println("Car driveing started...");
	}
	
}//car
 
 
 interface Jeep{
	 default void drive() {
			System.out.println("Jeep driveing started...");
		}
	 
 }//jeep

 class Vehicle implements Jeep,Car{
	 
	 /*there are two approches to solve diamond problem in java
	  * we have to override that methods available in both interfaces
	  * or
	  * call that method woth below syntax
	  * 
	  * <Interface name>.super.<Method name>
	  * 
	  */
	 

	@Override
	public void drive() {
		Car.super.drive();
		Jeep.super.drive();
		System.out.println("Vehicle drive...");
	}
	 
	 
	 
 }//vehicle


public class DiamondProblemTest {
	
	public static void main(String[] args) {
		Vehicle vh=new Vehicle();
		vh.drive();
	}

}
