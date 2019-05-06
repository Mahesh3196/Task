package com.Split;

import java.util.Scanner;

/*  split a given string into an array .*/

public class Split {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String to split");
		String c = s.nextLine();

		/* split the String */
		String[] d = c.split(" ");

		/* prints the splited String in array */
		System.out.println();
		System.out.println("----OUTPUT----");
		System.out.println();

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		/* reverse the splited string */
		System.out.println();
		System.out.println("----REVERSE ARRAY----:");
		System.out.println();
		for (int j = d.length - 1; j >= 0; j--) {
			System.out.println(d[j]);
		}

		/*
		 * prints the first half array element in First and second half element in
		 * Second.
		 */

		System.out.println();
		System.out.print("First=");
		for (int i = 0; i < d.length / 2; i++) {
			System.out.print(d[i] + " ");
		}

		System.out.println();
		System.out.print("Second=");
		for (int j = d.length / 2; j < d.length; j++) {
			System.out.print(d[j] + " ");
		}
	}
}
