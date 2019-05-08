package com.gmail.wildekatertz;

import java.util.Scanner;
import static java.lang.Math.random;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер массива");
		int n = sc.nextInt();

		int mas[] = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = 0 + (int) (random() * 99);
		}

		System.out.println("Строка с массивом:");
		System.out.println(arr2Str(mas));
	}

	public static String arr2Str(int a[]) {
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s = s + a[i] + " ";
		}
		s.trim();
		return s;
	}

}