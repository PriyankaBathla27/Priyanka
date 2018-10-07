public class EmployeeTest {
	
	public static void main(String args[]) {
	Employee empOne = new Employee(101);
	
	empOne.setSalary(4000);
	double net = empOne.netSalary(empOne.getSalary(), null);
	
	System.out.println(net);
	
	
	
	
	}
}