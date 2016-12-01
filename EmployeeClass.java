package Session4;

public class EmployeeClass {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Joey");
		employee.setEmployee_id(17625);
		employee.setDesignation("Software Developer");
		employee.setSalary(25000);
		
		System.out.println("Employee Name : " +employee.getName());
		System.out.println("Employee ID: " +employee.getEmployee_id());
		System.out.println("Employee Designation : " +employee.getDesignation());
		System.out.println("Employee Salary : " + employee.getSalary());
				
		
	}

}
