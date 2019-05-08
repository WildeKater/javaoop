package com.gmail.wildekatertz;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� ��������");
		String dirPath = sc.nextLine();

		System.out.println("������� �������� �����");
		String fileName = sc.nextLine();

		System.out.println("������� �����");
		String text = sc.nextLine();

		String filePath = dirPath + fileName;

		save2File(filePath, text);

	}

	public static void save2File(String filePath, String text) {

		try (PrintWriter newPrint = new PrintWriter(filePath)) {
			newPrint.println(text);
		} catch (FileNotFoundException e) {
			System.out.println("������ ������ � ���� " + filePath);
		}
		System.out.println("���� " + filePath + " �������");
	}

}