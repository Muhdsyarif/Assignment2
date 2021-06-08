import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int type,option,logout;
		
		Advertisment ad = new Advertisment();
		ad.printInfo();
		
		

		do {
			System.out.print("\nSign In as (1.Admin)|(2.Customer) : ");
			type = s.nextInt();
			System.out.println();
			switch(type) {
			case 1: //Admin login
				System.out.println("\n=========<WELCOME TO HUNTER BOWLING>=========");
				do {
					System.out.println("\n1.Employee System | 2.Finance System | 3. Advertisment System");
					System.out.print("Choose your option : ");
					option = s.nextInt();
					switch(option) {
					case 1:
						Employee e = new Employee();
						System.out.println(e);
						break;
						
					case 2:
						Finance f = new Finance();
						System.out.println(f);
						break;
						
					case 3:
						ad.printInfo();
						break;
					}
				if(option<1 && option>3) {
					System.out.println("\\n1.Employee System | 2.Finance System | 3. Advertisment System");
					System.out.print("Choose your option : ");
					option = s.nextInt();
				}
					System.out.print("\nLogout(1-Yes || 2-No) :");
					logout = s.nextInt(); 
				}
				while(logout==2);
				break;
				
			case 2: //Customer login
				System.out.println("\n=========<WELCOME TO HUNTER BOWLING>=========");
				do {
					System.out.println("\n1.Membership Registration | 2.Coaching Guide | 3.Advertisment | 4.Event Registration");
					System.out.print("Choose your option : ");
					option = s.nextInt();
					switch(option) {
					case 1:
						MembersCard members = new MembersCard();
						System.out.println(members);
						break;
						
					case 2:
						Guide g = new Guide();
						System.out.println(g);
						break;
						
					case 3:
						ad.printInfo();
						break;
						
					case 4:
						EventRegistration e = new EventRegistration();
						System.out.println(e);
						break;
					}
				if(option<1 && option>4) {
					System.out.println("\n1.Membership Registration | 2.Coaching Guide | 3.Advertisment | 4.Event Registration");
					System.out.print("Choose your option : ");
					option = s.nextInt();
				}
					System.out.print("\nLogout(1-Yes || 2-No) :");
					logout = s.nextInt();
				}
				while(logout==2);
				break;
			}
			System.out.print("\nContinue Using HUNTER BOWLING SYSTEM(1-YES,2-No) :");
			option =s.nextInt();
		}
		while(option==1);
		System.out.println("\n\n***Thankyou for visiting HUNTER BOWLING***");
	}
	
	
}
				
		

				
		   
	  
		
			
		

