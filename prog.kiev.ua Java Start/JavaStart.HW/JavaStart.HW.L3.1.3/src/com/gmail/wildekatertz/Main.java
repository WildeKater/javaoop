package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mYear;

		System.out.println("Введите год");
		mYear = sc.nextInt();

		if ((mYear % 4) == 0) {
			if ((mYear % 100) == 0) {
				if ((mYear % 400) == 0) {
					System.out.println("Год  высокосный, в году 366 дней");
				} else {
					System.out.println("Год не высокосный, в году 365 дней");
				}
			} else {
				System.out.println("Год высокосный, в году 365 дней");
			}
		} else {
			System.out.println("Год не высокосный");
		}

	}

}