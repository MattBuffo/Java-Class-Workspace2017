
import java.util.Scanner;
public class Sum {

	public static void main(String[] args){
		/* 1-100
		 * Scanner in = new Scanner(System.in);
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
		*/
		
		/* 2-100 Evens
		Scanner in = new Scanner(System.in);
		System.out.println("Input the desired minimum");
		int min = in.nextInt();
		System.out.println("Input the desired maximum");
		int max = in.nextInt();
		int total = 0;
		while(max >= min){
			if (max % 2 == 0){ 
			total += max;
			}
			max --;
		}
		System.out.println(total);
		*/
		
		/* Squares 
		Scanner in = new Scanner(System.in);
		System.out.println("Input the desired minimum");
		double min = in.nextInt();
		System.out.println("Input the desired maximum");
		double max = in.nextInt();
		double total = 0;
		while(max >= min){
			if (Math.sqrt(max) % 1 == 0){
			total += max;
			}
			max --;
		}
		System.out.println(total);
		*/
		
		/* odd numbers 
		Scanner in = new Scanner(System.in);
		System.out.println("Input the desired minimum");
		int min = in.nextInt();
		System.out.println("Input the desired maximum");
		int max = in.nextInt();
		int total = 0;
		while(max >= min){
			if (max % 2 == 1){ 
			total += max;
			}
			max --;
		}
		System.out.println(total);
		*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input the desired value ");
		int n = in.nextInt();
		double total = 0;
		int y = 0;
		while (n >=1){
			y = n % 10;
			if (y % 2 == 1)
			{
				total += y;
			}
			n = n/10;
		}
		System.out.println(total);
	}
}
