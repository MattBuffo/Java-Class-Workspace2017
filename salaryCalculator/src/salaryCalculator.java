
import java.util.Scanner;
public class salaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input Salary Without Dollar Sign");
		double salary = in.nextDouble();
		System.out.println("Input Hours Worked in Double Form");
		double hours = in.nextDouble();
		double overtime = 0;
		if (hours > 40)
		{
			overtime = hours - 40;
			hours = hours - overtime;
			
			
		}
		double pay = (hours*salary) + (overtime*salary*1.5);
		System.out.println(pay);
	}

}
