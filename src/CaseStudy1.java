import java.util.Scanner;

/**program to understand ReadData Types
 * @author Venkatesh@Techzenure
 * @since 27th july 2023
 */
public class CaseStudy1 {

	public static void main(String[] args) {
		int pizzaUnitPrice = 100;
		int puffUnitPrice = 20;
		int coolDrinkUnitPrice = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The No Of Pizzas Bought:");
		int pizzaQty = sc.nextInt();
		
		System.out.print("Enter The No Of Puffs Boght:");
		int puffsQty = sc.nextInt();
		
		System.out.print("Enter The NO Of Coolrinks Bought:");
		int coolDrinkQty = sc.nextInt();
		
		float pizzaCost = pizzaUnitPrice*pizzaQty;
		float puffCost = puffUnitPrice*puffsQty;
		float coolDrinkCost = coolDrinkUnitPrice*coolDrinkQty;
		
		float totalCost = pizzaCost + puffCost + coolDrinkCost;
		System.out.println();
		
		System.out.printf("\t\t BILL DETAILS\n");
		System.out.printf("No Of pizzas     :%d \t Coast: %2f \n", PizzaQty , PizzaCoast);
		System.out.printf("No Of Puffs      :%d \t Coast: %2f \n", puffsQty , puffsCoast);
		System.out.printf("No Of coolDrinks :%d \t Coast: %2f \n", coolDrinkQty , CoolDrinkCoast);
		
		System.out.printf("Total price: %.2f\n" , totalCost);
		System.out.println("ENJOY THE SHOW!!!");
	}

}
