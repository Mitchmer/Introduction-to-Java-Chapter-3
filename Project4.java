import java.util.Scanner;

public class Project4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int year, month, dayOfMonth;
		System.out.print("Enter year: (e.g., 2012): ");
		year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		dayOfMonth = input.nextInt();

		if (month == 1 || month == 2) {
			month += 12;
			year--;
		}

		int j = year / 100;
		int yearOfCentury = year % 100;

		int dayOfTheWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (j / 4) + (5 * j)) % 7;
		String dayName = "";
		switch (dayOfTheWeek) {
			case 0 -> dayName = "Saturday";
			case 1 -> dayName = "Sunday";
			case 2 -> dayName = "Monday";
			case 3 -> dayName = "Tuesday";
			case 4 -> dayName = "Wednesday";
			case 5 -> dayName = "Thursday";
			case 6 -> dayName = "Friday";
			default -> dayName = "unable to be calculated";
		}

		System.out.println("Day of the week is " + dayName);
	}
}
