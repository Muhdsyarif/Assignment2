import java.util.Scanner;

public class Employee {
	
	Scanner s = new Scanner(System.in);
	
	private double salary1 = 4500.00; //Manager salary
	private double salary2 = 2400.00; //Operator salary
	private double salary3 = 1200.00; //Cleaner salary
	
	Employee(){
		System.out.println("\n**HUNTER BOWLING WORKERS INFO SYSTEM**");
		workersInfo();
	}
	
	public void workersInfo() {
		System.out.println();
		System.out.println("1(Manager) || 2(Operator) || 3(Cleaner)");
		System.out.print("Input number to check workers info : ");
		int type = s.nextInt();
		switch(type) {
		case 1: 
			System.out.println("\nManager");
			System.out.println("\nName    : Johnson Boris"+
								"\nEmail  : Johnson@gmail.com"+
								"Age      : 48"+
								"\nTel    : 011-4575889"+
								"\nSalary : RM"+this.salary1);
			System.out.println("--------------------------------------------------");
			System.out.println("\nName    : Kasim Selamat"+
								"\nEmail  : kasim@gmail.com"+
								"\nAge    : 30"+
								"\nTel    : 012-44154888"+
								"\nSalary : RM"+this.salary1);
			System.out.println();
			break;
			
		case 2:
			System.out.println("\nOperator");
			System.out.println("\nName     : Ahmad"+
								"\nEmail   : ahmad@gmail.com"+
								"Age       : 50"+
								"\nTel     : 012-4496587"+
								"\nSalary  : Rm"+this.salary2);
			System.out.println("--------------------------------------------------");
			System.out.println("\nName     : Rahis"+
								"\nEmail   : rahis@gmail.com"+
								"\nAge     : 37"+
								"\nTel     : 011-6895475"+
								"\nSalary  : RM"+this.salary2);
			System.out.println("--------------------------------------------------");
			System.out.println("\nName     : Steven"+
								"\nEmail   : Steven@gmail.com"+
								"\nAge     : 40"+
								"\nTel     : 017-4562588"+
								"\nSalary  : RM"+this.salary2);
			System.out.println();
			break;
			
		case 3:
			System.out.println("\nCleaner");
			System.out.println("\nName     : Jia Lim"+
								"Age       : 56"+
								"\nTel     : 012-6859358"+
								"\nSalary  : Rm"+this.salary3);
			System.out.println("--------------------------------------------------");
			System.out.println("\nName     : Rohana"+
								"\nAge     : 45"+
								"\nTel     : 011-8796482"+
								"\nSalary  : RM"+this.salary3);
			System.out.println("--------------------------------------------------");
			System.out.println("\nName     : Guan Long"+
								"\nAge     : 55"+
								"\nTel     : 017-6894115"+
								"\nSalary  : RM"+this.salary3);
			System.out.println();
			break;
		}
	}

}
