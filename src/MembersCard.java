import java.util.Scanner;

public class MembersCard {

	Scanner s = new Scanner(System.in);
	
	private String name;
	private int phoneNum, age;
	
	
	MembersCard(){
		System.out.println("\n****Club Membership Registration****");
		System.out.print("\nName     : ");
		name = s.nextLine();
		System.out.print("Phone Number  :");
		phoneNum = s.nextInt();
		System.out.print("Age     : ");
		age = s.nextInt();
		
		
			System.out.println("\n\nPlease select your member card type!");
			System.out.print("(1.Standard)|(2.Premium)|(3.Gold) : ");
			int type = s.nextInt();
			switch(type) {
			case 1:
				System.out.println("\nYou have select standard member card");
				System.out.println("\n***INFO***");
				System.out.println("Name   : "+this.name+
									"\nTel    : "+this.phoneNum+
									"\nAge    : "+this.age+
									"\nMember Card : Standard Card");
				System.out.println("\n\n****THANK YOU FOR REGISTER IN OUR CLUB****");
				break;
				
			case 2:
				System.out.println("\nYou have select premium member card");
				System.out.println("\n***INFO***");
				System.out.println("Name   : "+this.name+
									"\nTel   : "+this.phoneNum+
									"\nAge   : "+this.age+
									"\nMember Card : Premium Card");
				System.out.println("\n\n****THANK YOU FOR REGISTER IN OUR CLUB****");
				break;
				
			case 3:
				System.out.println("\nYou have select gold member card");
				System.out.println("\n**INFO**");
				System.out.println("Name   : "+this.name+
									"\nTel    : "+this.phoneNum+
									"\nAge    : "+this.age+
									"\nMember Card : Gold Card");
				System.out.println("\n\n****THANK YOU FOR REGISTER IN OUR CLUB****");
				break;
			}
			System.out.println("You promise NOT to use to conduct any fraudulent or business activity or have more than one Member Account at any time.");
			System.out.println();

	}
}
