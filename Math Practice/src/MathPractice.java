import java.util.Scanner;

public class MathPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("First number, you useless human");
		double firstNumber = scan.nextDouble();
		System.out.println("Second number, tiny biologic");
		double secondNumber = scan.nextDouble();
		System.out.print("The sum is ");
		System.out.println(firstNumber + secondNumber);
		System.out.print("The difference is ");
		System.out.println(firstNumber - secondNumber);
		System.out.print("The product is ");
		System.out.println(firstNumber * secondNumber);
		System.out.print("The average is ");
		System.out.println((firstNumber+secondNumber)/2);
		System.out.print("The distance is ");
		System.out.println(Math.abs(firstNumber-secondNumber));
		System.out.print("The aximum is ");
		System.out.println(Math.max(firstNumber, secondNumber));
		System.out.print("The minimum is ");
		System.out.println(Math.min(firstNumber, secondNumber));
	}
}
