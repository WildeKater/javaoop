package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rooms;
		int entrance = -1;
		int floor = -1;
		int t; // ��������� ���������� ��� ������� �����

		System.out.println("������� ����� ��������");
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
			System.out.println("������� " + entrance);
			System.out.print("���� " + floor);
		} else {
			System.out.println("�������� �� ���������� ");
		}
	}

}