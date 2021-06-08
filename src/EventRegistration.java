import java.util.Scanner;

public class EventRegistration {
	
	Scanner s = new Scanner(System.in);

	private String name, gender,card;
	private int age, phoneNum, member;	
	
	EventRegistration(){
		System.out.print("\nMember [1.Yes|2.No]: ");
		this.member = s.nextInt();
		if(member 	== 1) {
			System.out.println("\n********HUNTER BOWLING EVENT REGISTRATION SYSTEM********");
			System.out.println();
			System.out.println("Enter Name: ");
			this.name = s.nextLine();
			System.out.print("Enter Gender: ");
			this.gender = s.nextLine();
			System.out.print("Enter Age: ");
			this.age = s.nextInt();
			System.out.print("Enter Phone Number: ");
			this.phoneNum = s.nextInt();
			System.out.print("Member Card [Standard/Premium/Gold]: ");
			this.card = s.nextLine();
			System.out.println();
			printDetail1();
			System.out.println();
			eventFee();
			
		}
		else if(member == 2) {
			System.out.println("\n********HUNTER BOWLING EVENT REGISTRATION SYSTEM********");
			System.out.println();
			System.out.println("Enter Name: ");
			this.name = s.nextLine();
			System.out.print("Enter Gender: ");
			this.gender = s.nextLine();
			System.out.print("Enter Age: ");
			this.age = s.nextInt();
			System.out.print("Enter Phone Number: ");
			this.phoneNum = s.nextInt();
			System.out.println();
			printDetail2();
			System.out.println();
			eventFee();
			
		}
	}
	
	public void printDetail1() {
		System.out.println("\n>>>>>>>>HUNTER BOWLING EVENT REGISTRATION INFO<<<<<<<<");
		System.out.println("\nName       : "+this.name);
		System.out.println("Gender       : "+this.gender);
		System.out.println("Age          : "+this.age);
		System.out.println("Phone Number : "+this.phoneNum);
		System.out.println("Member Card  : "+this.card);
	}
	
	public void printDetail2() {
		System.out.println("\n>>>>>>>>HUNTER BOWLING EVENT REGISTRATION INFO<<<<<<<<");
		System.out.println("\nName       : "+this.name);
		System.out.println("Gender       : "+this.gender);
		System.out.println("Age          : "+this.age);
		System.out.println("Phone Number : "+this.phoneNum);
	}
	
	public void eventFee() {
		System.out.println("\n*******  FEE PAYMENT INFO  *******");
		System.out.println("\n---> Entry Fees RM200.00 pergroup.");
		System.out.println("---> For member will receive 20% discount pergroup.");
		System.out.println("---> Participants must comply with the rules of the competition.");
		System.out.println("---> Please ensure your application.");
		System.out.print("\nConfirm Entry Fees [1.Yes|2.No]: ");
		int payFee = s.nextInt();
		if(payFee == 1) {
			System.out.println("Resgistration Complete. THANKS YOU!!!");
		}
		else if(payFee == 2) {
			System.out.println("Resgistration Failed.");
		}
	}
	
	
}
