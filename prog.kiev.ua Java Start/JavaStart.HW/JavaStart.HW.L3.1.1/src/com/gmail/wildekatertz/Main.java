package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeric1;
		int numeric2;
		int numeric3;
		int numeric4;
		int maxNumeric;

		System.out.println("Введите четыре числа");
		numeric1 = sc.nextInt();
		numeric2 = sc.nextInt();
		numeric3 = sc.nextInt();
		numeric4 = sc.nextInt();

		maxNumeric = numeric1;
		maxNumeric = (numeric2 >= maxNumeric) ? numeric2 : maxNumeric;
		maxNumeric = (numeric3 >= maxNumeric) ? numeric3 : maxNumeric;
		maxNumeric = (numeric4 >= maxNumeric) ? numeric4 : maxNumeric;

		System.out.println("Максимальное число равно " + maxNumeric);
	}

}