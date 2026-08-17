/*
	Define and use a class:
	Create a Student class with the following:
	Feilds :name(string), rollno(int), marks(float)
	Methods :displayDetails(), This method should display the student's name, rollno,and marks.
	Instantiate an object of the student class and call the displayDetails() method.
*/

import java.util.Scanner;
class Student
{
	String name;
	int rollno;
	float marks;
	
	void displayDetails()
	{
		System.out.println("++++++++++++++ Student Details +++++++++++++");
		System.out.println("Student's Name:" + name);
		System.out.println("Student's RollNo:" + rollno);
		System.out.println("Student's Marks:" + marks);
		System.out.println("++++++++++++++ Student Details +++++++++++++");
	}




	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
	
		
		System.out.println("Enter the student's name : ");
		s.name = sc.nextLine();
		System.out.println("Enter the student' rollno : ");
		s.rollno = sc.nextInt();
		System.out.println("Enter student's marks : ");
		s.marks = sc.nextFloat();
		System.out.println();
				
		s.displayDetails();
		
		sc.close();
	}
}