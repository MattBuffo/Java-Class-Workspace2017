
public class forlooppractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* first excercise
		for(int i=1; i <=301; i++){
			System.out.println(i*3);
		}
		*/
		
		/* sum of all evens 2-100
		
		int total = 0;
		for(int number =0; number <=100; number += 2){
			total += number;
		}
		System.out.println(total);
		*/
		
		/* sum of squares 1-100
		double total = 0;
		for(int number = 0; number*number <= 100; number ++)
		{
			total += number*number;
		}
		System.out.println(total);
		*/
		
		/*sum between a and b inclusive
		int total = 0;
		int b = 100;
		for(int a = 1; a <= b; a++){
			total += a;
		}
		System.out.println(total);
		*/
		
		/* sum of all odd digits
		 * 
		int total = 0;
		for(int number = 32677; number > 0 ; number = number / 10){
			total += oddAdjustedValue(number % 10);
		}
		System.out.println(total);
		*/
	}
	
	public static int oddAdjustedValue(int digit){
		if (digit % 2 == 1)
		{
			return digit;
		}
		else
		{
		return 0;	
		}
	}
}
