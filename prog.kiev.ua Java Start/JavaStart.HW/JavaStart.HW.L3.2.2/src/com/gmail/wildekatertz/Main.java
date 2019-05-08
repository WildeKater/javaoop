package com.gmail.wildekatertz;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x;
		double y;

		System.out.println("Введите координаты точки");
		x = sc.nextDouble();
		y = sc.nextDouble();

		double ax = 0;
		double ay = 0;

		double bx = 4;
		double by = 4;

		double cx = 6;
		double cy = 1;

		/*
		 * t1..t3 временные переменные для определения расположения точки относительно
		 * сторон треугольника
		 */

		double t1 = (ax - x) * (by - ay) - (bx - ax) * (ay - y);
		double t2 = (bx - x) * (cy - by) - (cx - bx) * (by - y);
		double t3 = (cx - x) * (ay - cy) - (ax - cx) * (cy - y);

		if ((t1 <= 0 & t2 <= 0 & t3 <= 0) | (t1 > 0 & t2 > 0 & t3 > 0)) {
			System.out.println("Точка внутри треугольника");
		} else {
			System.out.println("Точка за пределами треугольника");
		}

	}

}