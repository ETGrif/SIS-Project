import java.util.Scanner;

public class mainMenu
	{
		static Scanner intInput = new Scanner(System.in);

		static int userChoice;
		static int userChoice2;
		static int userChoice3;

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
						AddAndDeleteStudents.addingAndDeleting();

					}
				if (userChoice == 2)
					{
						System.out.println("Change Student Grades/Schedule");

						System.out.println("(1) Change Grade");
						System.out.println("(2) Switch Classes");
						userChoice2 = intInput.nextInt();
						if(userChoice == 1)
							{
								GradeChanger.changeGrade();
							}
						if(userChoice == 2)
							{
								ScheduleChanger.changeSchedule();
							}

					}
				if (userChoice == 3)
					{
						System.out.println("Sort Students");

						System.out.println("(1) Sort by last name");
						System.out.println("(2) Sort by GPA");

						System.out.println("(3) Sort by period");
						userChoice2 = intInput.nextInt();

						if (userChoice2 == 1)
							{
								Sorting.lastName();
							}
						if (userChoice2 == 2)
							{
								Sorting.GPA();
							}
						if (userChoice2 == 3)
							{
								System.out.println("Which period would you like to choose?");
								System.out.println("(1) Period 1");
								System.out.println("(2) Period 2");
								System.out.println("(3) Period 3");

								userChoice3 = intInput.nextInt();

								if (userChoice3 == 1)
									{
										Sorting.period1();
									}
								if (userChoice3 == 2)
									{
										Sorting.period2();
									}
								if (userChoice3 == 3)
									{
										Sorting.period3();
									}

							}

					}

			}

	}
