import java.util.Scanner;

public class MeterConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables and scanner class
		double meters;
		Scanner meterInput = new Scanner(System.in);
		//initialize variable
		System.out.println("Please type a valid number of meters in console");
		meters = meterInput.nextDouble();
		System.out.println(3.28084*meters + "Feet");
		System.out.println(39.3701*meters + "Inches");
		System.out.println(0.000621371*meters + "Miles");
		meterInput.close();
		System.out.println("Thanks!");
	}

}
