package studio1;

import java.io.PrintStream;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("The first of two integers to be averaged?");
		System.out.print("Enter first integar: ");
		int n1 = in.nextInt();
		double d1=n1;
		System.out.print("Enter second integar: ");
		int n2 = in.nextInt();
		double d2=n2;
		double avg = (d1 + d2)/2;
		System.out.print("The average is " + avg);
		

	}

}
