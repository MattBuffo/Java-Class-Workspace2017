import java.util.Scanner;
public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input a double");
		System.out.println(absolute(input.nextDouble()));
		input.close();
	}
		
	
	public static double absolute(double x){
		

		/* Unnessecary, can just use math
		 if (x < 0)

		{
			double y = 0-x;
		}
		else if(x > 0)
		{
			double y = x;
		} */
		double z = Math.pow(x, 2);
		double y = Math.sqrt(z);
		return y;
	}

}
