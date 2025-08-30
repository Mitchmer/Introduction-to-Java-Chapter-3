import java.util.Scanner;

public class Project3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days = 0, month, year;
		String monthName = "";

		System.out.print("Enter a month in the year (e.g., 1 for Jan): ");
		month = input.nextInt();
		System.out.print("Enter a year: ");
		year = input.nextInt();
		boolean isLeap = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);

		switch (month) {
			case 1 -> { monthName = "January"; days = 31; }
			case 2 -> { monthName = "February"; days = (isLeap ? 29 : 28); }
			case 3 -> { monthName = "March"; days = 31; }
			case 4 -> { monthName = "April"; days = 30; }
			case 5 -> { monthName = "May"; days = 31; }
			case 6 -> { monthName = "June"; days = 30; }
			case 7 -> { monthName = "July"; days = 31; }
			case 8 -> { monthName = "August"; days = 31; }
			case 9 -> { monthName = "September"; days = 30; }
			case 10 -> { monthName = "October"; days = 31; }
			case 11 -> { monthName = "November"; days = 30; }
			case 12 -> { monthName = "December"; days = 31; }
			default -> {
				System.out.println("Invalid month."); System.exit(0);
			}
		}

		System.out.print(monthName + " " + year + " has " + days + "days");

	}
}
