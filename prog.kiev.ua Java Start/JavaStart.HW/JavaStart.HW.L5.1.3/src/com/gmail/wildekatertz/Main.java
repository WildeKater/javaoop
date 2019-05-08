package com.gmail.wildekatertz;

import static java.lang.Math.random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int n = 15;

		int[] mas = new int[n];
		int[] mas2 = new int[n * 2];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = 0 + (int) (random() * 99);
		}

		System.out.println(Arrays.toString(mas));

		for (int i = 0; i < mas.length; i++) {
			mas2[i] = mas[i];
			mas2[mas.length + i] = mas[i] * 2;
		}

		System.out.println(Arrays.toString(mas2));

	}
}