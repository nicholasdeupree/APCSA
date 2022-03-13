
public class EmployeeTester {
	public static void main(String[] args) {
		Employee worker1 = new Employee("John","Smith",50000);
		//worker1.raiseSalary(20);
		System.out.println(worker1.getSalary());
		System.out.println(worker1.calculateBonusAmount(3));
	}
}
