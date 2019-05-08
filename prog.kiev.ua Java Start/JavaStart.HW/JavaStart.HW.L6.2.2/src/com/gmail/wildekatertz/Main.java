package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int t = 3;

		int n = 1;
		for (int i = 0; i < t; i++) {
			n = n * 10;
		}
		n = n - 1;

		int pn = 0;
		int pn1 = 0;
		int pn2 = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if ((i * j >= pn) & (ptest(i * j) == true)) {
					pn = i * j;
					pn1 = i;
					pn2 = j;
				}
			}
		}

		System.out.println(pn1 + " * " + pn2 + " = " + pn);

	}

	public static boolean ptest(int a) {

		String s = String.valueOf(a);
		StringBuffer st = new StringBuffer(s);
		String s2 = String.valueOf(st.reverse());

		boolean tmp = s.equals(s2);
		return tmp;
	}

}