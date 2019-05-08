package com.gmail.wildekatertz;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int height;
		int width;

		System.out.println("¬ведите высоту и ширину пр€моугольника ");
		height = sc.nextInt();
		width = sc.nextInt();

		for (int i = 1; i <= height; i++) {
			System.out.print("*");
			for (int j = 1; j <= (width - 2); j++) {
				if ((i == 1) | (i == height)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}

	}

}