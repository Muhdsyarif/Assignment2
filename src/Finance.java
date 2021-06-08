import java.util.Scanner;

public class Finance extends Employee{
	
	Scanner s = new Scanner(System.in);
	
	private double totalFee, profit, netincome;
	
	Finance(){
		System.out.println("\n*******FINANCE SYSTEM********");
		System.out.println("Please insert information needed.");
		System.out.print("\nTotal Fees entry: RM");
		this.totalFee = s.nextDouble();
		this.profit = this.totalFee;
		if(profit < 0 ) {
			System.out.printf("\nLoss    : RM%2.f" ,this.profit);
			System.out.println();
		}
		else if(profit == 0) {
			System.out.printf("\nBalance : RM%2.f" ,this.profit);
			System.out.println();
		}
		else {
			System.out.printf("\nProfit  : RM%2.f" ,this.profit);
			System.out.println();
		}	
		printInfo();
		System.out.println();
	}
	
	
	public void printInfo() {
		Payment em = new EmployeeSalary();
		double salary = em.payment();
		this.netincome = this.profit - salary;
		if(netincome < 0) {
			System.out.printf("\nNet Income Loss      : RM%2.f" ,this.netincome);
			System.out.println();
		}
		else if(netincome == 0) {
			System.out.printf("\nNet Income Balance   : RM%2.f" ,this.netincome);
			System.out.println();
		}
		else {
			System.out.printf("\nNet Income Profit   : RM%2.f" ,this.netincome);
			System.out.println();
		}
	}
	
	
}
