package com.gmail.wildekatertz;

import java.util.Formatter;

public class Main {
	public static void main(String[] args) {

		for (int i = 2; i < 12; i++) {
			Formatter form = new Formatter();
			form.format("%." + i + "f", Math.PI);
			String text = form.toString();
			System.out.println(text);
		}

	}
}