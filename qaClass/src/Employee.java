public class Employee {

	int empID;
	String name;
	int age;
	String designation;
	double salary;

	public static final String company = "A&M Technologies";

	// This is the constructor of the class Employee kjkjkj
	public Employee(int empID) {
		this.empID = empID;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Assign the age of the Employee to the variable age.
	public void setAge(int empAge) {
		age = empAge;
	}

	/* Assign the designation to the variable designation. */
	public void setDesignation(String empDesig) {
		designation = empDesig;
	}

	/* Assign the salary to the variable salary. */
	public void setSalary(double empSalary) {
		salary = empSalary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public double netSalary(double sal, String status) {
		double netsal;
		if (status == "Married") {
			netsal = sal - (sal * 0.2);
		} else {
			netsal = sal - (sal * 0.3);
		}
		return netsal;
	}
	
	public double bonus() {
		return 100;
	}

	

}