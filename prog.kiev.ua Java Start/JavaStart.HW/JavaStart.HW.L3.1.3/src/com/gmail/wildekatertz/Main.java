package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mYear;

		System.out.println("������� ���");
		mYear = sc.nextInt();

		if ((mYear % 4) == 0) {
			if ((mYear % 100) == 0) {
				if ((mYear % 400) == 0) {
					System.out.println("���  ����������, � ���� 366 ����");
				} else {
					System.out.println("��� �� ����������, � ���� 365 ����");
				}
			} else {
				System.out.println("��� ����������, � ���� 365 ����");
			}
		} else {
			System.out.println("��� �� ����������");
		}

	}

}