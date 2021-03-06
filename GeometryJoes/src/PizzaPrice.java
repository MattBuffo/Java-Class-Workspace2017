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
	//Constant definition, subject to change information 
	final int LARGE_SIZE = 14;
	final int MEDIUM_SIZE = 12;
	final int SMALL_SIZE = 10;
	final double PRICE_PER_SQUARE_INCH = 0.05;
	final double REGULAR_TOPPING_PRICE = 0.49;
	final double PREMIUM_TOPPING_PRICE = 0.79;
	//Other Constant definition
	final double LARGE_PRICE = PRICE_PER_SQUARE_INCH*((Math.PI)*(Math.pow((7), 2)));
	final double MEDIUM_PRICE = PRICE_PER_SQUARE_INCH*((Math.PI)*(Math.pow((MEDIUM_SIZE/2), 2)));
	final double SMALL_PRICE = PRICE_PER_SQUARE_INCH*((Math.PI)*(Math.pow((SMALL_SIZE/2), 2)));
	final double REGULAR_LARGE_TOPPING = Math.sqrt(REGULAR_TOPPING_PRICE*LARGE_SIZE);
	final double REGULAR_MEDIUM_TOPPING = Math.sqrt(REGULAR_TOPPING_PRICE*MEDIUM_SIZE);
	final double REGULAR_SMALL_TOPPING = Math.sqrt(REGULAR_TOPPING_PRICE*SMALL_SIZE);
	final double PREMIUM_LARGE_TOPPING = Math.sqrt(PREMIUM_TOPPING_PRICE*LARGE_SIZE);
	final double PREMIUM_MEDUIM_TOPPING = Math.sqrt(PREMIUM_TOPPING_PRICE*MEDIUM_SIZE);
	final double PREMIUM_SMALL_TOPPING = Math.sqrt(PREMIUM_TOPPING_PRICE*SMALL_SIZE);
	final double TAX_RATE = 0.07;
	final double DELIVERY_RATE = 0.10;
	//Manual Variable Definition
	 String customerName = "G. Hopper";
	 String pizzaOneName = "Medium Cheese";
	 String pizzaTwoName = "null";
	 String pizzaThreeName = "null";
	 int pizzaOneQuantity = 3;
	 int pizzaTwoQuantity = 0;
	 int pizzaThreeQuantity = 0;
	 int pizzaOneRegToppings = 0;
	 int pizzaTwoRegToppings = 0;
	 int pizzaThreeRegToppings = 0;
	 int pizzaOnePremToppings = 0;
	 int pizzaTwoPremToppings = 0;
	 int pizzaThreePremToppings = 0;
	//Automatically Defined Variables 
	 double pizzaOnePrice = 0;
	 double pizzaTwoPrice = 0;
	 double pizzaThreePrice = 0;
	 double subtotal = 0;
	 double tax = 0;
	 double delivery = 0;
	 double total = 0;
	 // Pizza One Calculations
	 pizzaOnePrice = (pizzaOneQuantity) *(MEDIUM_PRICE);
	 // null for now pizzaOnePrice += (pizzaOneQuantity)*(pizzaOneRegToppings)*(REGULAR_MEDIUM_TOPPING);
	 // null for now pizzaOnePrice += (pizzaOneQuantity)*(pizzaOnePremToppings)*(PREMIUM_MEDIUM_TOPPING);
	 // Pizza Two Calculations
	 //None in this case
	 //Pizza Three Calculations
	 //None in the case
	 //Subtotal Calculation
	 subtotal = (pizzaOnePrice + pizzaTwoPrice + pizzaThreePrice);
	 //Tax Calculations
	 tax = (TAX_RATE)*(subtotal);
	 subtotal += tax;
	 //Delivery Charge
	 delivery = Math.min(DELIVERY_RATE*subtotal, 5.00);
	 //Total Calculation
	 total = subtotal + delivery;
	 //Prints for Customer One
	 System.out.println("Thank You for Eating at Geometry Joe's!");
	 System.out.println("Customer " + customerName);
	 System.out.printf("%-2d%-15s%42.2f\n", pizzaOneQuantity, pizzaOneName, pizzaOnePrice);
	 System.out.printf("Tax:%55.2f\n", tax);
	 System.out.printf("Delivery:%50.2f\n", delivery);
	 System.out.printf("Total:%53.2f\n\n\n\n", total);
	 
	 
	 
	 
	 
	 
	 //Next Customer; Gates
	 customerName = "B. Gates";
	 pizzaOneName = "Small Veggie";
	 pizzaOneQuantity = 2;
	 pizzaOneRegToppings = 1;
	 pizzaOnePremToppings = 2;
	 pizzaTwoName = "Large Meat Lover";
	 pizzaTwoQuantity = 1;
	 pizzaTwoRegToppings = 2;
	 pizzaTwoPremToppings = 1;
	 //Pizza One Calculations 
	 pizzaOnePrice = (pizzaOneQuantity) *(SMALL_PRICE);
	 pizzaOnePrice += (pizzaOneQuantity)*(pizzaOneRegToppings)*(REGULAR_SMALL_TOPPING);
	 pizzaOnePrice += (pizzaOneQuantity)*(pizzaOnePremToppings)*(PREMIUM_SMALL_TOPPING);
	 //Pizza Two Calculations
	 pizzaTwoPrice = (pizzaTwoQuantity) *(LARGE_PRICE);
	 pizzaTwoPrice += (pizzaTwoQuantity)*(pizzaTwoRegToppings)*(REGULAR_LARGE_TOPPING);
	 pizzaTwoPrice += (pizzaTwoQuantity)*(pizzaTwoPremToppings)*(PREMIUM_LARGE_TOPPING);
	 //Subtotal Calculations
	 subtotal = pizzaOnePrice + pizzaTwoPrice;
	 //Tax
	 tax = (TAX_RATE)*(subtotal);
	 subtotal += tax;
	 //Delivery Charge
	 delivery = Math.min(DELIVERY_RATE*subtotal, 5.00);
	 //Total Calculation
	 total = subtotal + delivery;
	 //Prints for Customer One
	 System.out.println("Thank You for Eating at Geometry Joe's!");
	 System.out.println("Customer " + customerName);
	 System.out.printf("%-2d%-15s%42.2f\n", pizzaOneQuantity, pizzaOneName, pizzaOnePrice);
	 System.out.printf("%-2d%-15s%41.2f\n", pizzaTwoQuantity, pizzaTwoName, pizzaTwoPrice);
	 System.out.printf("Tax:%55.2f\n", tax);
	 System.out.printf("Delivery:%50.2f\n", delivery);
	 System.out.printf("Total:%53.2f\n\n\n\n", total);
	 
	 
	 
	 
	 
	 //Gosling 
	 customerName = "J. Gosling";
	 pizzaOneName = "Large Peperoni With Extra Cheese";
	 pizzaOneQuantity = 1;
	 pizzaOneRegToppings = 2;
	 pizzaOnePremToppings = 0;
	 pizzaTwoName = "Small Mushroom and Sausage";
	 pizzaTwoQuantity = 2;
	 pizzaTwoRegToppings = 2;
	 pizzaTwoPremToppings = 0;
	 pizzaThreeName = "Medium with Everything";
	 pizzaThreeQuantity = 1;
	 pizzaThreeRegToppings = 6;
	 pizzaThreePremToppings = 4;
	 //Pizza One Calculations 
	 pizzaOnePrice = (pizzaOneQuantity) *(LARGE_PRICE);
	 pizzaOnePrice += (pizzaOneQuantity)*(pizzaOneRegToppings)*(REGULAR_LARGE_TOPPING);
	 pizzaOnePrice += (pizzaOneQuantity)*(pizzaOnePremToppings)*(PREMIUM_LARGE_TOPPING);
	 //Pizza Two Calculations
	 pizzaTwoPrice = (pizzaTwoQuantity) *(SMALL_PRICE);
	 pizzaTwoPrice += (pizzaTwoQuantity)*(pizzaTwoRegToppings)*(REGULAR_SMALL_TOPPING);
	 pizzaTwoPrice += (pizzaTwoQuantity)*(pizzaTwoPremToppings)*(PREMIUM_SMALL_TOPPING);
	 // Pizza Three Calculations
	 pizzaThreePrice = (pizzaThreeQuantity) *(MEDIUM_PRICE);
	 pizzaThreePrice += (pizzaThreeQuantity)*(pizzaThreeRegToppings)*(REGULAR_MEDIUM_TOPPING);
	 pizzaThreePrice += (pizzaThreeQuantity)*(pizzaThreePremToppings)*(PREMIUM_MEDUIM_TOPPING);
	 //Subtotal Calculations
	 subtotal = pizzaOnePrice + pizzaTwoPrice + pizzaThreePrice;
	 //Tax
	 tax = (TAX_RATE)*(subtotal);
	 subtotal += tax;
	 //Delivery Charge
	 delivery = Math.min(DELIVERY_RATE*subtotal, 5.00);
	 //Total Calculation
	 total = subtotal + delivery;
	 //Prints for Customer One
	 System.out.println("Thank You for Eating at Geometry Joe's!");
	 System.out.println("Customer " + customerName);
	 System.out.printf("%-2d%-15s%25.2f\n", pizzaOneQuantity, pizzaOneName, pizzaOnePrice);
	 System.out.printf("%-2d%-15s%31.2f\n", pizzaTwoQuantity, pizzaTwoName, pizzaTwoPrice);
	 System.out.printf("%-2d%-15s%35.2f\n", pizzaThreeQuantity, pizzaThreeName, pizzaThreePrice);
	 System.out.printf("Tax:%55.2f\n", tax);
	 System.out.printf("Delivery:%50.2f\n", delivery);
	 System.out.printf("Total:%53.2f\n\n\n\n", total);
	 
	 
	 
	 
	 //Matt Buffo
	 customerName = "M. Buffo";
	 pizzaOneName = "Large Cheese";
	 pizzaOneQuantity = 1;
	 pizzaOneRegToppings = 0;
	 pizzaOnePremToppings = 0;
	 //Pizza One Calculations 
	 pizzaOnePrice = (pizzaOneQuantity) *(LARGE_PRICE);
	 pizzaOnePrice += (pizzaOneQuantity)*(pizzaOneRegToppings)*(REGULAR_LARGE_TOPPING);
	 pizzaOnePrice += (pizzaOneQuantity)*(pizzaOnePremToppings)*(PREMIUM_LARGE_TOPPING);
	 //Subtotal Calculations
	 subtotal = pizzaOnePrice;
	 //Tax
	 tax = (TAX_RATE)*(subtotal);
	 subtotal += tax;
	 //Delivery Charge
	 delivery = Math.min(DELIVERY_RATE*subtotal, 5.00);
	 //Total Calculation
	 total = subtotal + delivery;
	 //Prints for Customer One
	 System.out.println("Thank You for Eating at Geometry Joe's!");
	 System.out.println("Customer " + customerName);
	 System.out.printf("%-2d%-15s%42.2f\n", pizzaOneQuantity, pizzaOneName, pizzaOnePrice);
	 System.out.printf("Tax:%55.2f\n", tax);
	 System.out.printf("Delivery:%50.2f\n", delivery);
	 System.out.printf("Total:%53.2f\n\n\n\n", total);
	}
		
}
