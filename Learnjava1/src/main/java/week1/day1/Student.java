package week1.day1;

public class Student {
	public static void main(String[] args) {
		String studentName="M.RAJALAKSHMI";
		int rollNum=12345;
		String collegeName="Anna University chennai";
		int markScored=1150;
		double cgpa=8.5;
		Student obj=new Student();
		obj.studentName();
		obj.rollNum();
		obj.collegeName();
		obj.markScored();
		obj.cgpa();
	}


	public void studentName() {
		System.out.println("The Student name is: M.RAJALAKSHMI");
	}
	public void rollNum() {
		System.out.println("ROLLNO:12345");
	}
	public void collegeName() {
		System.out.println("College Name is: Anna University, Chennai");
	}
	public void markScored() {
		System.out.println("The Mark Scored by the student is:1150");
	}
	public void cgpa() {
		System.out.println("The CGPA of the student is:8.5");
	}
	
}

