import java.util.Scanner;

public class Guide{
	
	Scanner s = new Scanner(System.in);
	private int month;
	private double guidePrice, totalPrice;
	
	Guide(){
		
		System.out.println("\n\n*****WELCOME TO OUR BOWLING COACHING GUIDE*****");
		System.out.println("\nTraining period that want to registered in month(6,9)");
		this.month = s.nextInt();
		if(this.month == 6) {
			guidePrice = 85.00;
			System.out.println("\n\nYou choose 6 month training class");
			System.out.println("Price : RM" + this.guidePrice);
			System.out.print("\nDo you have member card (1.Standard)|(2.Premium)|(3.Gold) : ");
			int member = s.nextInt();
			switch(member) {
			case 1:System.out.println("\nPrice : RM" + this.guidePrice);
				   System.out.println();
				   System.out.println("Standard Member Card, You will receive 15% discount");
				   totalPrice = guidePrice*15/100;
				   System.out.println("Total Price RM: " + totalPrice);
				   break;
				   
			case 2:System.out.println("\nPrice : RM" + this.guidePrice);
			   	   System.out.println("Premium Member Card, You will receive 30% discount");
			   	   totalPrice = guidePrice*30/100;
			   	   System.out.println("Total Price : RM" + totalPrice);
			   	   break;
			   
			case 3:System.out.println("\nPrice : RM" + this.guidePrice);
			   	   System.out.println("Gold Member Card, You will receive 50% discount");
			   	   totalPrice = guidePrice*50/100;
			   	   System.out.println("Total Price : RM" + totalPrice);
			   	   break;
			}
		}
		else if(this.month == 9) {
			guidePrice = 120.00;
			System.out.println("\n\nYou choose 9 month training class");
			System.out.println("Price : RM" + this.guidePrice);
			System.out.print("\nDo you have member card (1.Standard)|(2.Premium)|(3.Gold) : ");
			int member = s.nextInt();
			switch(member) {
			case 1:System.out.println("\nPrice : RM" + this.guidePrice);
				   System.out.println("Standard Member Card, You will receive 15% discount");
				   totalPrice = guidePrice*15/100;
				   System.out.println("Total Price RM: " + totalPrice);
				   break;
				   
			case 2:System.out.println("\nPrice : RM" + this.guidePrice);
			   		System.out.println("Premium Member Card, You will receive 30% discount");
			   		totalPrice = guidePrice*30/100;
			   		System.out.println("Total Price : RM" + totalPrice);
			   		break;
			   
			case 3:System.out.println("\nPrice : RM" + this.guidePrice);
			   		System.out.println("Gold Member Card, You will receive 50% discount");
			   		totalPrice = guidePrice*50/100;
			   		System.out.println("Total Price : RM" + totalPrice);
			   		break;
			}
		}
		else {
			System.out.println("Invalid Input");
		}
			
	}
}	
