public class Employee{
	public Employee( ){
		myFirstName = "";
		myLastName = "";
		mySalary = 45000;
		// Other constructor(s) here
		//Returns employee's salary.
	}
	public Employee(String firstName, String lastName, double moneyEarned)
	{
		myFirstName = firstName;
		myLastName = lastName;
		mySalary = moneyEarned;
	}
	public double getSalary( ) {
		return mySalary;
	}
	//Employee salary increased by byPercent percent.
	public void raiseSalary(double byPercent) {
		double former = mySalary;
		mySalary += (mySalary * (byPercent*.01));
	}
	public double calculateBonusAmount(double byPercent)
	{
		return (mySalary*(byPercent*.01));
	}
	private String myFirstName;
	private String myLastName;
	private double mySalary;
}
