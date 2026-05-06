/**

        * File: Lesson 4.3 - do While

        * Author: alexanderAuton

        * Date Created: April 10, 2026

        * Date Last Modified: May 06, 2026

        */
	   import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner (System.in);
		int num;
		do { 
			System.out.print("Input a positive integer: ");
			num = input.nextInt();
		}while (num < 0);
		System.out.println(num*2);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner (System.in);
		String psswrd;
		String psswrd2;
		do{
			System.out.print("Input a password: ");
			psswrd = input.nextLine();
			System.out.print("Confirm the password: ");
			psswrd2 = input.nextLine();
		}while(!psswrd.equals(psswrd2));
		System.out.println("success.");

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner (System.in);
		int num;
		int num2;
		do { 
			System.out.print("Input an integer: ");
			num = input.nextInt();
			System.out.print("Input an integer that is a multiple of the first integer: ");
			num2 = input.nextInt();
		}while(num2%num != 0);
		System.out.println("success.");
	}
}
