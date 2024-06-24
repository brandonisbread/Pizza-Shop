import java.util.Scanner;

public class PizzaShop
{
	public static void main(String[] args) 
	{
		// variables
		String customer;
		int toppings;
		Scanner input = new Scanner(System.in);
		Pizza order1 = new Pizza();

		//input
		Pizza.intro();
		System.out.print("Please enter the name of the customer >> ");
		customer = input.nextLine();
		System.out.print("Now please enter the amount of toppings the customer would like >> ");
		toppings = input.nextInt();

		// processing
		order1.enterName(customer);
		order1.addToppings(toppings);
		order1.calcPrice();
		
		// output
		order1.summary();

	}
}