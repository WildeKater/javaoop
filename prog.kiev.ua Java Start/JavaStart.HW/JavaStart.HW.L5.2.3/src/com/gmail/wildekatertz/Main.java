package com.gmail.wildekatertz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you have?");
		double money = sc.nextDouble();

		String t = String.valueOf(money);
		System.out.println("You have: " + t);

		// TODO
		String sMoney = "";
		/*
		 * считаем миллионы
		 */
		if ((int) (money / 100_000_000) > 0) {
			sMoney = sMoney + part1((int) (money / 100_000_000)) + " hundred ";
		}

		if ((int) ((int) (money % 100_000_000) / 1_000_000) > 0) {
			sMoney = sMoney + part1((int) ((int) (money % 100_000_000) / 1_000_000));
		}

		if ((int) (money / 1_000_000) > 0) {
			sMoney = sMoney + " million ";
		}
		/*
		 * считаем тысячи
		 */
		if ((int) ((int) (money % 1_000_000) / 100_000) > 0) {
			sMoney = sMoney + part1((int) ((int) (money % 1_000_000) / 100_000)) + " hundred ";
		}

		if ((int) ((int) (money % 100_000) / 1_000) > 0) {
			sMoney = sMoney + part1((int) ((int) (money % 100_000) / 1_000));
		}

		if ((int) (money / 1_000) > 0) {
			sMoney = sMoney + " thousand ";
		}
		/*
		 * считаем сотни
		 */
		if ((int) ((int) (money % 1_000) / 100) > 0) {
			sMoney = sMoney + part1((int) ((int) (money % 1_000) / 100)) + " hundred ";
		}

		if ((int) ((int) (money % 100) / 1) > 0) {
			sMoney = sMoney + part1((int) ((int) (money % 100) / 1));
		}
		if ((int) (money / 1) > 0) {
			sMoney = sMoney + " dollars ";
		}
		/*
		 * считаем центы
		 */

		if ((int) ((money * 100) % 100) > 0) {
			sMoney = sMoney + part1((int) ((money * 100) % 100) / 1) + " cents";
		}

		System.out.println("You have: " + sMoney);

	}

	public static String part1(int s) {
		String ppart1 = "";
		switch (s) {
		case 1:
			ppart1 = "one";
			break;
		case 2:
			ppart1 = "two";
			break;
		case 3:
			ppart1 = "three";
			break;
		case 4:
			ppart1 = "four";
			break;
		case 5:
			ppart1 = "five";
			break;
		case 6:
			ppart1 = "six";
			break;
		case 7:
			ppart1 = "seven";
			break;
		case 8:
			ppart1 = "eight";
			break;
		case 9:
			ppart1 = "nine";
			break;
		case 10:
			ppart1 = "ten";
			break;
		case 11:
			ppart1 = "eleven";
			break;
		case 12:
			ppart1 = "twelve";
			break;
		case 13:
			ppart1 = "thirteen";
			break;
		case 14:
			ppart1 = "fourteen";
			break;
		case 15:
			ppart1 = "fifteen";
			break;
		case 16:
			ppart1 = "sixteen";
			break;
		case 17:
			ppart1 = "seventeen";
			break;
		case 18:
			ppart1 = "eighteen";
			break;
		case 19:
			ppart1 = "nineteen";
			break;
		case 20:
			ppart1 = "twenty";
			break;
		case 21:
			ppart1 = "twenty one";
			break;
		case 22:
			ppart1 = "twenty two";
			break;
		case 23:
			ppart1 = "twenty three";
			break;
		case 24:
			ppart1 = "twenty four";
			break;
		case 25:
			ppart1 = "twenty five";
			break;
		case 26:
			ppart1 = "twenty six";
			break;
		case 27:
			ppart1 = "twenty seven";
			break;
		case 28:
			ppart1 = "twenty eight";
			break;
		case 29:
			ppart1 = "twenty nine";
			break;
		case 30:
			ppart1 = "thirty";
			break;
		case 31:
			ppart1 = "thirty one";
			break;
		case 32:
			ppart1 = "thirty two";
			break;
		case 33:
			ppart1 = "thirty three";
			break;
		case 34:
			ppart1 = "thirty four";
			break;
		case 35:
			ppart1 = "thirty five";
			break;
		case 36:
			ppart1 = "thirty six";
			break;
		case 37:
			ppart1 = "thirty seven";
			break;
		case 38:
			ppart1 = "thirty eight";
			break;
		case 39:
			ppart1 = "thirty nine";
			break;
		case 40:
			ppart1 = "forty";
			break;
		case 41:
			ppart1 = "forty one";
			break;
		case 42:
			ppart1 = "forty two";
			break;
		case 43:
			ppart1 = "forty three";
			break;
		case 44:
			ppart1 = "forty four";
			break;
		case 45:
			ppart1 = "forty five";
			break;
		case 46:
			ppart1 = "forty six";
			break;
		case 47:
			ppart1 = "forty seven";
			break;
		case 48:
			ppart1 = "forty eight";
			break;
		case 49:
			ppart1 = "forty nine";
			break;
		case 50:
			ppart1 = "fifty";
			break;
		case 51:
			ppart1 = "fifty one";
			break;
		case 52:
			ppart1 = "fifty two";
			break;
		case 53:
			ppart1 = "fifty three";
			break;
		case 54:
			ppart1 = "fifty four";
			break;
		case 55:
			ppart1 = "fifty five";
			break;
		case 56:
			ppart1 = "fifty six";
			break;
		case 57:
			ppart1 = "fifty seven";
			break;
		case 58:
			ppart1 = "fifty eight";
			break;
		case 59:
			ppart1 = "fifty nine";
			break;
		case 60:
			ppart1 = "sixty";
			break;
		case 61:
			ppart1 = "sixty one";
			break;
		case 62:
			ppart1 = "sixty two";
			break;
		case 63:
			ppart1 = "sixty three";
			break;
		case 64:
			ppart1 = "sixty four";
			break;
		case 65:
			ppart1 = "sixty five";
			break;
		case 66:
			ppart1 = "sixty six";
			break;
		case 67:
			ppart1 = "sixty seven";
			break;
		case 68:
			ppart1 = "sixty eight";
			break;
		case 69:
			ppart1 = "sixty nine";
			break;
		case 70:
			ppart1 = "seventy";
			break;
		case 71:
			ppart1 = "seventy one";
			break;
		case 72:
			ppart1 = "seventy two";
			break;
		case 73:
			ppart1 = "seventy three";
			break;
		case 74:
			ppart1 = "seventy four";
			break;
		case 75:
			ppart1 = "seventy five";
			break;
		case 76:
			ppart1 = "seventy six";
			break;
		case 77:
			ppart1 = "seventy seven";
			break;
		case 78:
			ppart1 = "seventy eight";
			break;
		case 79:
			ppart1 = "seventy nine";
			break;
		case 80:
			ppart1 = "eighty";
			break;
		case 81:
			ppart1 = "eighty one";
			break;
		case 82:
			ppart1 = "eighty two";
			break;
		case 83:
			ppart1 = "eighty three";
			break;
		case 84:
			ppart1 = "eighty four";
			break;
		case 85:
			ppart1 = "eighty five";
			break;
		case 86:
			ppart1 = "eighty six";
			break;
		case 87:
			ppart1 = "eighty seven";
			break;
		case 88:
			ppart1 = "eighty eight";
			break;
		case 89:
			ppart1 = "eighty nine";
			break;
		case 90:
			ppart1 = "ninety";
			break;
		case 91:
			ppart1 = "ninety one";
			break;
		case 92:
			ppart1 = "ninety two";
			break;
		case 93:
			ppart1 = "ninety three";
			break;
		case 94:
			ppart1 = "ninety four";
			break;
		case 95:
			ppart1 = "ninety five";
			break;
		case 96:
			ppart1 = "ninety six";
			break;
		case 97:
			ppart1 = "ninety seven";
			break;
		case 98:
			ppart1 = "ninety eight";
			break;
		case 99:
			ppart1 = "ninety nine";
			break;
		}
		return ppart1;
	}

}