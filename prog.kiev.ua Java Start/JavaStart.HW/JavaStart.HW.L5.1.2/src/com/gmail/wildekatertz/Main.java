package com.gmail.wildekatertz;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.println("Введите размер массива ");
		n = sc.nextInt();

		int[] mas = new int[n];

		System.out.println("Введите элементы массива ");

		for (int i = 0; i < mas.length; i++) {
			mas[i] = sc.nextInt();
		}

		System.out.println("Вы ввели массив: ");
		System.out.println(Arrays.toString(mas));

	}
}