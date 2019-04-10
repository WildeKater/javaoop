package com.gmail.wildekatertz;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat(4, 8, true, "Milk", "Vaska", "Home cat");

		cat.getVoice();

		System.out.println(cat);

		Animal an = cat;

		Animal[] zoo = new Animal[10];
		zoo[0] = cat;
		
		an.getVoice();

	}

}
