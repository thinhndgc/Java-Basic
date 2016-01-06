// Author Thinhd
import java.util.Scanner;

public class Main {

	private static Scanner input;
	
	public static void main(String[] args) {
		solveQuadratic();
	}
		
	public static void solveQuadratic(){
		double a = 0;
		double b = 0;
		double c = 0;
		boolean check = false;
		input = new Scanner(System.in);
		while (!check) {
			System.out.println("Insert a");
			a = input.nextDouble();
			if (a == 0) {
				System.out.println("a can not = 0, try again!");
			}else {
				check = true;
			}
		}
		System.out.println("Insert b");
		b = input.nextDouble();
		System.out.println("Insert c");
		c = input.nextDouble();
		System.out.println("This quadratic is: " + a + "x^2 + " + b + "x + " + c + " = 0");
		calQuadratic(a, b, c);
	}
	
	public static void calQuadratic(double a, double b, double c){
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		delta = b*b - 4*a*c;
		System.out.println("Delta = " + delta);
		if (delta < 0) {
			System.out.println("This quadratic has no solution");
		}else {
			if (delta == 0) {
				x1 = x2 = (-b)/(2*a);
				System.out.println("This quadratic has 1 solution x = " + x1);
				int z = (int)x1;
				System.out.println("x after cast to integer = " + z);
			}else {
				x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				x1 = ((-b) - Math.sqrt(delta)) / (2*a);
				System.out.println("This quadratic has 2 solution x1 = " + x1 + " and x2 = " + x2);
				int y = (int)x1;
				int z = (int)x2;
				System.out.println("x1 after cast to integer = " + y);
				System.out.println("x1 after cast to integer = " + z);
			}
		}
	}

}
