import java.util.Scanner;

import javax.swing.JOptionPane;

public class FastFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner order = new Scanner(System.in);
		final double BURGER_PRICE = 2.99;
		final double FRY_PRICE = 0.99;
		final double SODA_PRICE = 1.49;
		double total = 0;
		System.out.println("Welcome to [FAST FOOD PLACE], we can take your order!");
		System.out.printf("How many burgers? (%-4.2f)", BURGER_PRICE);
		total += BURGER_PRICE * order.nextInt();
		System.out.printf("How many fries (%-4.2f)", FRY_PRICE);
		total += FRY_PRICE * order.nextInt();
		System.out.printf("How many Sodas (%-4.2f)", SODA_PRICE);
		total += SODA_PRICE * order.nextInt();
		System.out.printf("%-5.2f", total);
		order.close(); 
		
	}

}
