package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeric;
		System.out.println("¬ведите число ");
		numeric = sc.nextInt();

		if ((numeric > 4) & (numeric < 16)) {
			int numericFactorial = 1;
			for (int i = 1; i <= numeric; i++) {
				numericFactorial = numericFactorial * i;
			}
			System.out.println("‘акториал числа " + numeric + " равен " + numericFactorial);
		} else {
			System.out.println("„исло не в промежутке 4<n<16 ");
		}

	}

}