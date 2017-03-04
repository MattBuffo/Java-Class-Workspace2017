/* Geometry Joe's Pizza  by Matt Buffo
 * 3/3/17
 * 
 *This project calculates the price of a pizza order for an imaginary pizza place. 
 *The details of an order need to be manually specified in the source code for now.
 */


//imports, currently blank
public class PizzaPrice {
	//Class declaration and construction of main method
	public static void main (String[] args){
	//Constant definition 
	final int LARGE_SIZE = 14;
	final int MEDIUM_SIZE = 12;
	final int SMALL_SIZE = 10;
	final double LARGE_PRICE = (Math.PI)*(Math.pow((LARGE_SIZE/2), 2));
	final double MEDIUM_PRICE = (Math.PI)*(Math.pow((MEDIUM_SIZE/2), 2));
	final double SMALL_PRICE = (Math.PI)*(Math.pow((SMALL_SIZE/2), 2));
	
	//Variable Definition
	 String customerName = "Matt";
	 String pizzaOneName = "large mushroom";
	 String pizzaTwoName = "large red pepper and mushroom";
	 String pizzaThreeName = "large cheese";
	 double pizzaOneQuantity = 1;
	 double pizzaTwoQuantity = 1;
	 double pizzaThreeQuantity = 1;
	 double pizzaOnePrice;
	 double pizzaTwoPrice;
	 double pizzaThreePrice;
	 // Pizza One Calculations
	 pizzaOnePrice = (pizzaOneQuantity) *(LARGE_PRICE +  2);
	 
	}
		
}
