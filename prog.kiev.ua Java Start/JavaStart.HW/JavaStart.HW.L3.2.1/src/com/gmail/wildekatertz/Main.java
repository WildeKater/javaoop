package com.gmail.wildekatertz;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x;
		double y;

		System.out.println("������� ���������� (x,y) �����");
		x = sc.nextDouble();
		y = sc.nextDouble();

		if ((sqrt(pow((x - 0), 2) + pow((y - 0), 2))) < 4.0) {
			System.out.println("����� ������ �����");
		} else {
			System.out.println("����� �� ��������� �����");
		}

	}

}