import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// calculate discriminant
		double discriminant = (b * b) - (4 * a * c);
		if (discriminant > 0) {
			// discriminant is positive, two roots
			// positive root r1
			double r1 = ((b * -1) + Math.pow(discriminant, 0.5))/(2 * a);
			double r2 = ((b * -1) - Math.pow(discriminant, 0.5))/(2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);

		} else if (discriminant == 0) {
			// discriminant is zero, one root
			double r1 = (b * -1)/(2 * a);
			System.out.println("The root is " + r1);
		} else {
			// discriminant is negative, no roots
			System.out.println("The equation has no real roots");
		}
	}
}