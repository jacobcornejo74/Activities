import java.util.Scanner;

class Menu { 
	String food;
	int item;
	double price;

	Menu(String food, int item, double price) {
		this.food = food;
		this.item = item;
		this.price = price;

	}
}
class Student {
	double Discount = 0.10;
	double Discounted;
	double Total;

	Student(double price) {
		this.Discounted = this.Discount * price;
		this.Total = price - this.Discounted;

	}
}


public class main {
	public static void main(String[] args) {
		Menu Adobo = new Menu("Adobo", 1, 50);
		Menu Sinigang = new Menu("Sinigang", 2, 60);
		Menu Kaldereta = new Menu("Kaldereta", 3, 55);
		Menu Sisig = new Menu("Sisig", 4, 90);
		Menu Chicken = new Menu("Chicken", 5, 80);
		int TotalItems = 0;
		double TotalBeforeDis = 0;
		double TotalDiscount = 0;
		double FinalAmount = 0;



		String again = "Y";

		while (again.equalsIgnoreCase("Y")) {
			Scanner input = new Scanner(System.in);
			System.out.println("=====   MENU    =====");
			System.out.printf("1. Adobo      - $%.2f%n", Adobo.price);
			System.out.printf("2. Sinigang   - $%.2f%n", Sinigang.price);
			System.out.printf("3. Kaldereta  - $%.2f%n", Kaldereta.price);
			System.out.printf("4. Sisig      - $%.2f%n", Sisig.price);
			System.out.printf("5. Chicken    - $%.2f%n", Chicken.price);
			System.out.print("Enter item number: ");
			int choi = input.nextInt();
			while ( choi < 1 ||choi > 5){
				System.out.println("Invalid Character. Choose again: ");
				choi = input.nextInt();

			}
			System.out.print("Enter quantity: ");
			int quanti = input.nextInt();

			System.out.print("Are you a Student? (Y/N): ");
			String answer = input.next();

			double price = 0;

			switch (choi) {
    			case 1: price = Adobo.price; break;
    			case 2: price = Sinigang.price; break;
    			case 3: price = Kaldereta.price; break;
    			case 4: price = Sisig.price; break;
    			case 5: price = Chicken.price; break;
}

			double subtotal = price * quanti;

			System.out.printf("Subtotal: $%.2f%n", subtotal);

			boolean isStu = answer.equalsIgnoreCase("Y");
			double discount = 0;
			double finalamount = subtotal;
			if (isStu) {
    			Student s = new Student(subtotal);
    			discount = s.Discounted;
  				finalamount = s.Total;

    			System.out.printf("Discount: $%.2f%n", s.Discounted);
				System.out.printf("Total: $%.2f%n", s.Total);
			} else {
    			System.out.printf("Discount: $%.2f%n", 0.0);
				System.out.printf("Total: $%.2f%n", subtotal);
}

			System.out.print("Do you want to order again? (Y/N): ");
			again = input.next();

			TotalItems += quanti;
			TotalBeforeDis += subtotal;
			TotalDiscount += discount;
			FinalAmount += finalamount;

			if (again.equalsIgnoreCase("N")) {
				System.out.println("Total items: " + TotalItems);
				System.out.printf("Total before discount: $%.2f%n", TotalBeforeDis);
				System.out.printf("Total discount: $%.2f%n", TotalDiscount);
				System.out.printf("Final amount: $%.2f%n", FinalAmount);

				
			}
			}
	}
}

