package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = in.nextInt();
		boolean leapYear;
		leapYear=year%4==0&&(year%100!=0||year%400==0);
		System.out.print(year +" is a leap year: " +leapYear);
	}

}
