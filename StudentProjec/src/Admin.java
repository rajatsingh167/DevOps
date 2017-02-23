import java.util.Scanner;

public class Admin {

	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular stud = new StudentSchedular();
	public static void main(String[] args) {
		showMenu();

	}

	private static void showMenu() {
		int choice;

		while(true){
			System.out.println("1.add student");
			System.out.println("2.show all students");
			System.out.println("3.exit");



			System.out.println("Enter your choice");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:acceptStudentDetails();
			break;
			case 2:showAllStudentDetails();
			break;
			case 3:System.exit(0);

			default : System.out.println("Sorry you entered wrong choice");
			}
		}
	}

	private static void acceptStudentDetails() {
		int rollNumber;
		String name;

		System.out.println("Enter roll number");
		rollNumber = sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();

		System.out.println(stud.addStudent(rollNumber, name));

	}

	private static void showAllStudentDetails() {
		stud.showStudents();

	}

}
