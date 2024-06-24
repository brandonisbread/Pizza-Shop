/* Chapter 4 extra project
   Starting price for a pizza is $15.99
   Toppings cost .50 cents each */

public class Pizza
{
	// Instance variables for the Pizza class
	private String custName;
	private double price;
	private int numToppings;

	// new custom constructor
	public Pizza()
	{
		custName = "Customer";
		price = 15.99;
		numToppings = 0;
	} // end of constructor method

	// basic static method for this class
	public static void intro()
	{
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Welcome to the Digital Pizza Shop");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	} // end of intro method 
	// mutator methods
	public void enterName(String name)
	{
		custName = name;
	}

	public void addToppings(int num)
	{
		numToppings = num;
	}

	public void calcPrice()
	{
		price = price + (numToppings * .50);
	}
	//accessor methods
	public void summary()
	{
		System.out.println();
		System.out.println("Thank you " + custName);
		System.out.print("A pizza with " + numToppings + " topping(s) ");
		System.out.println("will cost $" + price + "!");
	}
		
} // end of class block