package com.gmail.wildekatertz;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите размер массива");
		int n = sc.nextInt();

		exportMas(createArray(n));

	}

	public static int[][] createArray(int n) {
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = 0 + (int) (Math.random() * 9);
			}
		}
		return mas;
	}

	public static void exportMas(int mas[][]) {

		try (PrintWriter pw = new PrintWriter("New.txt")) {
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (j < mas[i].length - 1) {
						pw.print(mas[i][j] + ",");
					} else {
						pw.print(mas[i][j]);
					}
				}
				pw.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error file write");
		}

	}

}