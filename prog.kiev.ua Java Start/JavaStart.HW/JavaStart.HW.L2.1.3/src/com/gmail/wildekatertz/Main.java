package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ����������");
		double r = sc.nextDouble();

		double p = 2.0 * Math.PI * r;

		System.out.println("����� ���������� ����� " + p);
	}

}