package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите стороны треугольника ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (((a + b) > c) && ((b + c) > a) && ((c + a) > b)) {
			System.out.println("Треугольник существует");
		} else {
			System.out.println("Треугольник не существует");
		}

	}

}