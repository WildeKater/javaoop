package com.gmail.wildekatertz;

import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {

		double a = 0.3;
		double b = 0.4;
		double c = 0.5;

		double p = (a + b + c) / 2.0;
		double s = sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("������� ������������ ����� " + s);
	}

}