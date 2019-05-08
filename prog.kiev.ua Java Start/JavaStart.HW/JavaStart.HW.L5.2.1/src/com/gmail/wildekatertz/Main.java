package com.gmail.wildekatertz;

import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �������");

		int n = sc.nextInt();

		int[][] mas = new int[n][n];
		/*
		 * ���������� ������� ������� n x n
		 */
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = 0 + (int) (random() * 9);
			}
		}
		/*
		 * ����������� ����� �������
		 */
		for (int i = 0; i < mas.length; i++) {
			System.out.println(Arrays.toString(mas[i]));
		}

		System.out.println("������� ���� ��������");
		int rev = sc.nextInt();

		/*
		 * ������� �������
		 */
		for (int z = 0; z < (((rev % 360) / 90)); z++) {

			int b = mas.length - 1;

			for (int i = 0; i <= (b / 2); i++) {
				for (int j = 0 + i; j < b - i; j++) {
					int t = mas[j][b - i];
					mas[j][b - i] = mas[i][j];
					mas[i][j] = mas[b - j][i];
					mas[b - j][i] = mas[b - i][b - j];
					mas[b - i][b - j] = t;
				}
			}

		}
		/*
		 * ����� ������������ �������
		 */
		System.out.println("������ ����������� �� " + rev + " ��������:");
		for (int i = 0; i < mas.length; i++) {
			System.out.println(Arrays.toString(mas[i]));
		}

	}
}