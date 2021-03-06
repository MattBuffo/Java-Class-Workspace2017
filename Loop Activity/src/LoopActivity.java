import java.util.Scanner;

public class LoopActivity {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		whilesWaldo(in);

	}

	public static void findFractions(Scanner in){
		double targetNumerator = 0;
		double targetDenominator = 0;
		String closestFractionAbove = "oops";
		String closestFractionBelow = "oops";
		double closestAbove = 0;
		double closestBelow = 0;
		System.out.println("Input numerator");
		targetNumerator = in.nextInt();
		System.out.println("Input denominator");
		targetDenominator = in.nextInt();
		for(double d = 1; d <= 100; d++){
			for(double n = 1; n <= 100; n++){
				if( ((targetNumerator/targetDenominator) > n/d) &&((targetNumerator/targetDenominator) - n/d) < ((targetNumerator/targetDenominator) - closestBelow)){
					closestBelow = n/d;
					closestFractionBelow = n + "/" + d;
				}
				if( ((targetNumerator/targetDenominator) < n/d) &&(Math.abs((n/d) - (targetNumerator/targetDenominator))) < (Math.abs( closestAbove - (targetNumerator/targetDenominator)))){
					closestAbove = n/d;
					closestFractionAbove = n + "/" + d;
				}
			}
		}
		System.out.println(closestFractionBelow);
		System.out.println(closestFractionAbove);
	}

	public static void squareRoot(Scanner in){
		System.out.println("Input Desired Number");
		double targetNumber = in.nextDouble();
		double testNumber = Math.abs((targetNumber - 1)/2);
		double previousTest = targetNumber;
		while(Math.abs(previousTest -testNumber) >= 0.0001){
			previousTest = testNumber;
			testNumber = (previousTest + targetNumber/previousTest)/2;
		}
		System.out.printf("%10.4f", testNumber);

	}

	public static void factorial(Scanner in){
		System.out.println("Desired number?");
		int targetNumber = in.nextInt();
		int total = 1;
		while(targetNumber > 0){
			total = total * targetNumber;
			targetNumber --;
		}
		System.out.println(total);
	}
	public static void asteriskDiamond(Scanner in){
		System.out.println("Input the desired side length");
		int sideLength = in.nextInt();
		String currentRow = "oops";
		String printLength = "%" +sideLength + "s";
		for(int r = 1; r <= sideLength; r++){
			currentRow = "";
			for(int j = sideLength - r; j > 0 ; j--){
				currentRow += " ";
			}
			for(int i =1; i <= -1 + 2*r; i++){

				currentRow += "*";
			}
			System.out.printf(printLength, currentRow);
			System.out.println();
		}
		for(int r = sideLength - 1; r > 0; r--){
			currentRow = "";
			for(int j = sideLength - r; j > 0 ; j--){
				currentRow += " ";
			}
			for(int i =1; i <= -1 + 2*r; i++){

				currentRow += "*";
			}
			System.out.printf(printLength, currentRow);
			System.out.println();
		}
	}

	public static void whilesWaldo(Scanner in){
		int timesRead = 0;
		System.out.println("Desired score?");
		double targetScore = in.nextDouble();
		double currentScore = 0;
		while(targetScore - currentScore > 0.01){
			currentScore += (100 - currentScore)/10;
			timesRead ++;
		}
		System.out.println("He Needed to Study For " + timesRead + " Months");
	}
}
