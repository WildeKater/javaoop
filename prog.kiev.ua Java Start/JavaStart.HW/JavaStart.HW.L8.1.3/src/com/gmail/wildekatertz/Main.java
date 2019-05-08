package com.gmail.wildekatertz;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите адрес каталога");
		String dirPath = sc.nextLine();

		getDirList(dirPath);

	}

	public static void getDirList(String dirPath) {
		
		File newDir = new File(dirPath);
		
		if (newDir.isDirectory()) {
			
			String[] dirList = newDir.list();
			System.out.println("Подкаталоги каталога  " + dirPath);
			
			for (int i = 0; i < dirList.length; i++) {
				
				File testNewDir = new File(dirPath + dirList[i]);
				
				if (testNewDir.isDirectory()) {
					System.out.println(dirList[i]);
				}
			}
		} else {
			System.out.println("Каталог " + dirPath + " не существует");
		}
	}

}