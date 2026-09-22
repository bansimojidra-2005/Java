import java.util.Scanner;
public class EmployeeMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.print("\nEnter Employee Id: ");
		emp.setEmpId(sc.nextInt());
		System.out.print("\nEnter Employee Name: ");
		emp.setEmpName(sc.next());
		System.out.print("\nEnter Employee Salary: ");
		emp.setEmpSalary(sc.nextFloat());
	
		System.out.println("===========Employee Details============");

		System.out.println("Emp Id:"+emp.getEmpId());
		System.out.println();
		System.out.println("Emp Name:"+emp.getEmpName());
		System.out.println();
		System.out.println("Emp Salary:"+emp.getEmpSalary());
		System.out.println();
	}
}