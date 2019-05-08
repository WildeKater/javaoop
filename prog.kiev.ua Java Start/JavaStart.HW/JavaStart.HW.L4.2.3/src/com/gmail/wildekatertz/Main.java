package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int width;

		System.out.println("¬ведите ширину часов ");
		width = sc.nextInt();
		int b = (width - 1) / 2;

		for (int i = 0; i < width; i++) {
			int z = 0;

			int t1 = 1;
			int t2 = 1;
			int t3 = 1;
			int t4 = width;

			if (i <= b) {
				z = width - i * 2;
			} else {
				z = i * 2 - width + 2;
			}
			t2 = (width - z) / 2 + 1;
			t3 = t2 + z - 1;

			if (t1 == t2) {
				for (int j = 0; j < width; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = t1; j < t2; j++) {
					System.out.print(" ");
				}
				for (int j = t2; j <= t3; j++) {
					System.out.print("*");
				}
				for (int j = t3 + 1; j <= t4; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}
