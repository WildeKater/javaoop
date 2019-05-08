package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeric;

		System.out.println("Введите число");
		numeric = sc.nextInt();

		/*
		 * Далее две временные переменные для расчёта 
		 */

		int numericPart1 = (numeric / 1000) + ((numeric % 1000) / 100);
		int numericPart2 = ((numeric % 100) / 10) + (numeric % 10) ;

		if (numericPart1 == numericPart1) {
			System.out.println("Номер счастливый");
		} else {
			System.out.println("Номер не счастливый");
		}

	}

}