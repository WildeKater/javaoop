package com.gmail.wildekatertz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку текста");
		String s = sc.nextLine();

		System.out.println("Вы ввели " + count(s) + " слов(а)");

	}

	/**
	 * Сounting the number of words
	 * 
	 * @param a <code> String </code> value. Input string.
	 * 
	 * @return <code> int </code> wordsCount value. Word numbers of string.
	 * 
	 * @author Alexey_A
	 */
	public static int count(String a) {
		a = a.trim();
		for (int i = 0; i < a.length(); i++) {
			a = a.replace("  ", " ");
		}
		String[] t = a.split(" ");
		int wordsCount = t.length;
		return wordsCount;
	}

}