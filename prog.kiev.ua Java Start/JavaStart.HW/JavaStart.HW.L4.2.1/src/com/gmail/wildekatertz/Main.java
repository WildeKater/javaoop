package com.gmail.wildekatertz;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int height;

		System.out.println("¬ведите высоту фигуры ");
		height = sc.nextInt();

		int width = 0;
		for (int i = 1; (i <= (height * 2 - 1)) & (width <= (height - (abs(height - i))));) {
			width++;
			if (width == (height - (abs(height - i)))) {
				width = 0;
				i++;
				System.out.println("*");
			} else {
				System.out.print("*");
			}

		}

	}

}