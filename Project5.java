import java.util.Scanner;

public class Project5 {
	public static void main(String[] args) {
		// if horizontal distance is <= 10.0/2 and vertical distance is <= 5.0/2, point is in a rectangle.

		Scanner input = new Scanner(System.in);
		double x, y;

		System.out.print("Enter a point with two coordinates: ");
		x = input.nextDouble();
		y = input.nextDouble();
		String isOrIsNot = ((Math.abs(x) <= 5.0) && (Math.abs(y) <= 2.5) ? "is" : "is not");

		System.out.println("Point (" + x + ", " + y + ") " + isOrIsNot + " in the rectangle");

	}
}
