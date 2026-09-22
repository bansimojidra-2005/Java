/*Java program (using setter & getter)
a) Accept ineger,string,float
b) use if else condition
c) use either for loop or do-while loop
d) include "break" & "continue" keyword*/


import java.util.Scanner;

public class Employee
{
	private int empId;
	private String empName;
	private float empSalary;
	
	public void SetEmpId (int eId)
	{
		this.empId=eId;
	}
	public void SetEmpName(String eName)
	{
		this.empName=eName;
	}
	public void SetEmpSalary(float eSalary)
	{
		this.empSalary=eSalary;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public float getEmpSalary()
	{
		return empSalary;
	}
}