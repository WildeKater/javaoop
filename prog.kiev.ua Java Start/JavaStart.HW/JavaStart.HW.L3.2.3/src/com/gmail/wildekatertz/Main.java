package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeric;

		System.out.println("������� �����");
		numeric = sc.nextInt();

		/*
		 * ����� ��� ��������� ���������� ��� ������� 
		 */

		int numericPart1 = (numeric / 1000) + ((numeric % 1000) / 100);
		int numericPart2 = ((numeric % 100) / 10) + (numeric % 10) ;

		if (numericPart1 == numericPart1) {
			System.out.println("����� ����������");
		} else {
			System.out.println("����� �� ����������");
		}

	}

}