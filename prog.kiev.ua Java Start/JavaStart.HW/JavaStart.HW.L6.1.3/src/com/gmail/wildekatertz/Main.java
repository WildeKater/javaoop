package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите высоту и ширину пр€моугольника");
		int width = sc.nextInt();
		int height = sc.nextInt();

		drawRectangle(width, height);

	}

	/**
	 * Draw rectangle width x height size.
	 * 
	 * @param a <code> int </code> value. Width of rectangle.
	 * @param b <code> int </code> value. Height of rectangle.
	 * 
	 * @author Alexey_A
	 */
	public static void drawRectangle(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}