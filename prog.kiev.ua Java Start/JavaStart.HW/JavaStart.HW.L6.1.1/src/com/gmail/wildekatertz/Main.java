package com.gmail.wildekatertz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер массива");
		int n = sc.nextInt();

		int[] a = getMas(n);

		System.out.println("Максимальный элемент массива равен " + nmax(a));

	}

	/**
	 * Input array
	 * 
	 * @param n <code> int </code> value. Array size.
	 * @return <code> int </code> a array. Input array.
	 * 
	 * @author Alexey_A
	 */
	public static int[] getMas(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите числа массива");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	/**
	 * Calculate max number of array
	 * 
	 * @param a <code> int [] </code> array. Input array.
	 * @return <code> int </code> max value. Max numeric of array.
	 * @author Alexey_A
	 */
	public static int nmax(int[] a) {
		int max = a[0];
		for (int i : a) {
			max = (i >= max) ? i : max;
		}
		return max;
	}

}