import java.util.Scanner;

public class mainMenu
	{
		static Scanner intInput = new Scanner(System.in);

		static int userChoice;
		static int userChoice2;

		public static void makeMenu()
			{
				System.out.println("What would you like to do?");

				System.out.println("(1) add or delete a student");

				System.out.println("(2) change student grades/schedule");

				System.out.println("(3) sort students");

				userChoice = intInput.nextInt();

			}

		public static void subMenu()
			{

				if (userChoice == 1)
					{
						System.out.println("Add or Delete a Student");

						System.out.println("(1) Add a Student");
						System.out.println("(2) Delete a Student");
					}
				if (userChoice == 2)
					{
						System.out.println("Change Student Grades/Schedule");

						System.out.println("(1) Change Grade");
						System.out.println("(2) Switch Classes");
					}
				if (userChoice == 3)
					{
						System.out.println("Sort Students");

						System.out.println("(1) Sort by last name");
						System.out.println("(2) Sort by GPA");

						System.out.println("(3) Sort by period");
					}

			}

	}
