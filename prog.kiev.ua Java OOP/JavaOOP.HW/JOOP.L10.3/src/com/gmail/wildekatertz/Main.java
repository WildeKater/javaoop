package com.gmail.wildekatertz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ������");
		String str = sc.nextLine();

		int[] ascii = str.chars().toArray();

		System.out.println("������ ASCII ����� �������� ������:");
		System.out.println(Arrays.toString(ascii));

	}

}
