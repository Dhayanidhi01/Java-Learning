package Java_Tutorial;

public class Employee {
//No Argument constructor
	String student_name;
	int rollNo;
	
	Employee(){
		
		rollNo=1;
		student_name="Dhayanidhi";
		System.out.println("Student is created");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee=new Employee();
		
		System.out.println(employee.rollNo);
		System.out.println(employee.student_name);
	}

}
