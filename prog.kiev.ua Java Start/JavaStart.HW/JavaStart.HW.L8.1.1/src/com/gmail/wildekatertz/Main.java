package com.gmail.wildekatertz;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите адрес каталога");
		String dirPath = sc.nextLine();

		System.out.println("¬ведите название файла");
		String fileName = sc.nextLine();

		System.out.println("¬ведите текст");
		String text = sc.nextLine();

		String filePath = dirPath + fileName;

		save2File(filePath, text);

	}

	public static void save2File(String filePath, String text) {

		try (PrintWriter newPrint = new PrintWriter(filePath)) {
			newPrint.println(text);
		} catch (FileNotFoundException e) {
			System.out.println("ќшибка записи в файл " + filePath);
		}
		System.out.println("‘айл " + filePath + " сохранЄн");
	}

}