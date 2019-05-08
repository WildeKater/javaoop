package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число");
		int iNumeric = sc.nextInt();

		System.out.println("Введите вещественное число");
		double dNumeric = sc.nextDouble();

		System.out.println("Введите строку");
		sc.nextLine();
		String sLine = sc.nextLine();

		System.out.println("Конкантенация: " + conc(iNumeric, dNumeric, sLine));

	}

	/**
	 * Calculate and return sum two integer number
	 * 
	 * @param a <code> int </code> value. First numeric of integer.
	 * @param b <code> int </code> value. Second numeric of double.
	 * @param s <code> String </code> value. Third values of string.
	 * @return <code> String </code> s + (a+b) value. Concat s with sum first and
	 *         second numeric.
	 * @author Alexey_A
	 */
	public static String conc(int a, double b, String s) {
		String concRes;
		concRes = s + " " + String.valueOf(a + b);
		return concRes;
	}

}