import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c,d,e,f;

		System.out.print("Enter a, b, c, d, e, f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();

		double determinant = (a * d) - (b * c);
		if (determinant == 0) {
			System.out.println("The equation has no solution");
			System.exit(0);
		} else {
			double x = ((e * d) - (b * f)) / determinant;
			double y = ((a * f) - (e * c)) / determinant;
			System.out.println("x is " + x + " and y is " + y); 
		}
	}	
}
