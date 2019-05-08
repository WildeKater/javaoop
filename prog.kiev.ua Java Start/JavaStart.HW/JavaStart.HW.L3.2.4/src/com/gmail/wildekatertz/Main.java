package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeric;
		System.out.println("Введите число");
		numeric = sc.nextInt();

		if (((numeric / 100000) == ((numeric % 10) / 1)) & (((numeric % 100000) / 10000) == ((numeric % 100) / 10))
				& (((numeric % 10000) / 1000) == ((numeric % 1000) / 100))) {
			System.out.println("Число палиндром");
		} else {
			System.out.println("Число не палиндром");
		}

	}

}