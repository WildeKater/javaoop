package com.gmail.wildekatertz;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int n = 0;

		int[] mas = { 0, 5, 2, 4, 7, 1, 3, 19 };

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 1) {
				n++;
			}
		}

		System.out.println(n);

	}
}