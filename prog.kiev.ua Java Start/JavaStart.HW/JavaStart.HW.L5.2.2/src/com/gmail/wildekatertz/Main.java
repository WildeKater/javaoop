package com.gmail.wildekatertz;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер массива ");
		int n = sc.nextInt();

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = sc.nextInt();
		}

		System.out.println("Исходный массив: ");

		System.out.println(Arrays.toString(mas));

		int t;
		for (int i = 0; i <= (mas.length / 2); i++) {
			t = mas[(mas.length - 1) - i];
			mas[(mas.length - 1) - i] = mas[i];
			mas[i] = t;
		}

		System.out.println("Изменённый массив: ");

		System.out.println(Arrays.toString(mas));

	}
}