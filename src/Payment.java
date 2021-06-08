
interface Payment {
	
	double payment();
}

class EmployeeSalary implements Payment{
	public double payment() {
		return 19800.00;
	}
}
