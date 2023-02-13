package az2;

import java.util.Scanner;

public class Az2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("r= ");
		double r = scan.nextDouble();
		double C = 2 * 3.14 * r;
		double S = 3.14 * r * r;
		System.out.println("C= " + C);
		System.out.print("S= " + S);
	}

}
