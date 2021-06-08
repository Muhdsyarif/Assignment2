
public abstract class Bowling { //abstraction
	
	protected String name,location,holiday,openDay;
	protected String phoneNum;
	protected double open,close;
	
	Bowling(){
		this.name = "Hunter Bowling Sport Center.";
		this.location = "NO 12, JALAN HARMONI 3/8 TAMAN DESA HARMONI 81100 JOHOR BAHRU JOHOR.";
		this.phoneNum = "017-7254144";
		this.open = 9.35;
		this.close = 11.35;
		this.openDay = "Saturday - Thursday";
		this.holiday = "Friday";
		System.out.println("\n"+this.name);
		System.out.println(this.location);
		System.out.println(" ");
		System.out.println("Phone Number  : "+this.phoneNum);
		System.out.println("Open Time     : "+this.open+" a.m");
		System.out.println("Close Time    : "+this.close+" p.m");
		System.out.println("Open Day      : "+this.openDay);
		System.out.println("Holiday       : "+this.holiday);
		System.out.println(" ");
	}
	//abstract method and Polymorphism
	public abstract void printInfo();
	
	
}
