import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userScanner = new Scanner(System.in);
		System.out.println("Amount Due? (ex:3.99)");
		double price = userScanner.nextDouble();
		System.out.println("Amount Paid?");
		double paid = userScanner.nextDouble();
		if (paid < price)
				{
			System.out.println("Insufficent Moneys Human");
				}
		else if (paid == price)
			{
			System.out.println("Exact change, good Human");
			}
		else
		{
			System.out.println("Your Change Is");			
			int change = (int)((paid-price)*100);
			if (change/10000 >= 1)
			{
				System.out.println(change/10000 + " Hundred(s)");
			}
			change = change % 10000;
			if (change/5000 >= 1)
			{
				System.out.println(change/5000 + " Fifty(s)");
			}
			change = change % 5000;
			if (change/2000 >= 1)
			{
				System.out.println(change/2000 + " Twenties(s)");
			}
			change = change % 2000;
			if (change/1000 >= 1)
			{
				System.out.println(change/1000 + " Tens(s)");
			}
			change = change % 1000;
			if (change/500 >= 1)
			{
				System.out.println(change/500 + " Fives(s)");
			}			
			change = change % 500;
			if (change/100 >= 1)
			{
				System.out.println(change/100 + " Ones(s)");
			} 
			change = change % 100;
			if (change/25 >= 1)
			{
				System.out.println(change/25 + " Quarter(s)");
			} 
			change = change % 25;
			if (change/10 >= 1)
			{
				System.out.println(change/10 + " Dimes(s)");
			} 
			change = change % 10;
			if (change/5 >= 1)
			{
				System.out.println(change/5 + " Nickle(s)");
			} 
			change = change % 5;
			if (change/1 >= 1)
			{
				System.out.println(change/1 + " Penny/ Pennie(s)");
			} 
			
		}
	}

}
