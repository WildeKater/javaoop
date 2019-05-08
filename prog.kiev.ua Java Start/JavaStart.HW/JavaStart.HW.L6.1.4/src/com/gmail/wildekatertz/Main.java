package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите размер массива");
		int n = sc.nextInt();

		int a[] = getMas(n);

		System.out.println("¬ведите искомое число");
		int numeric = sc.nextInt();

		find(a, numeric);

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
		System.out.println("¬ведите числа массива");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	/**
	 * Find element of array
	 * 
	 * @param n <code> int[] </code> array. Input array.
	 * @param   <code> int </code> b value. Find numeric.
	 * @param   <code> int </code> resFind value. Position of find numeric.
	 * 
	 * @return <code> int </code>
	 * @author Alexey_A
	 */
	public static void find(int a[], int b) {
		int resFind = -1;
		for (int i = 0; i < a.length; i++) {
			resFind = (a[i] == b) ? i : resFind;
			if (resFind != -1) {
				break;
			}
		}
		System.out.println("»ндекс искомого элемента: " + resFind);
	}

}