package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rooms;
		int entrance = -1;
		int floor = -1;
		int t; // Временная переменная для расчёта этажа

		System.out.println("Введите номер квартиры");
		rooms = sc.nextInt();

		if (rooms <= 36) {
			entrance = 1;
		} else if ((rooms > 36) & (rooms <= 2 * 36)) {
			entrance = 2;
		} else if ((rooms > 2 * 36) & (rooms <= 3 * 36)) {
			entrance = 3;
		} else if (((rooms > 3 * 36) & (rooms <= 4 * 36))) {
			entrance = 4;
		}

		t = (entrance == 1) ? 0 : (entrance - 1) * 9;
		floor = (rooms % 4 == 0) ? (rooms / 4 - t) : (rooms / 4 + 1 - t);

		if ((entrance != -1) & (floor != -1)) {
			System.out.println("Подъезд " + entrance);
			System.out.print("Этаж " + floor);
		} else {
			System.out.println("Квартира не существует ");
		}
	}

}