package com.gmail.wildekatertz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s;

		System.out.println("¬ведите строку текста ");
		s = sc.nextLine();

		int t = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.toString(s.charAt(i)).equals("b")) {
				t++;
			}
		}

		System.out.println(t);
	}
}