package triangletest;
import java.util.Scanner;
public class triangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input three doubles, hitting enter between them");
		Scanner input = new Scanner(System.in);
		double sideOne = input.nextDouble();
		double sideTwo = input.nextDouble();
		double sideThree = input.nextDouble();
		if (sideOne + sideTwo < sideThree)
		{
			System.out.println("Not a Valid Triangle");
		}
		else if (sideOne + sideThree < sideTwo)
		{
			System.out.println("Not a Valid Triangle");
		}
		else if (sideThree + sideTwo < sideOne)
		{
			System.out.println("Not a Valid Triangle");
		}
		else
		{
			System.out.println("This is a Valid Triangle");
		}
		input.close();
		System.out.println(Math.random());
		int x = (int) ((Math.random() * 6) +1) ;
		System.out.println(x);
	}

}
