
import java.util.Scanner;
public class Sum {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Input the desired minimum");
		double min = in.nextInt();
		System.out.println("Input the desired maximum");
		double max = in.nextInt();
		double total = 0;
		while(max >= min){
			total += max;
			max --;
		}
		System.out.println(total);
	}
}