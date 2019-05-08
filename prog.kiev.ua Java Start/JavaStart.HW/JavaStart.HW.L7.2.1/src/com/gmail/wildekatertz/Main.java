package com.gmail.wildekatertz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Calendar clOldDate = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);

		Date dateNow = new Date();

		clOldDate.setTime(dateNow);

		int monthNow = clOldDate.get(Calendar.MONTH) + 1;
		int yearNow = clOldDate.get(Calendar.YEAR);

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

		String myInputDate = "";
		System.out.println("������� ���� � ������� ��.��.����");
		myInputDate = sc.nextLine();

		Date inputDate = new Date();

		try {
			inputDate = sdf.parse(myInputDate);
		} catch (ParseException e) {
			System.out.println(e);
		}

		Calendar clInputDate = Calendar.getInstance();
		clInputDate.setTime(inputDate);

		int monthInput = clInputDate.get(Calendar.MONTH) + 1;
		int yearInput = clInputDate.get(Calendar.YEAR);

		if (monthNow != monthInput) {
			System.out.println("����� ����������. �� ����� " + monthInput + " ������� " + monthNow);
		}
		if (yearNow != yearInput) {
			System.out.println("��� ����������. �� ����� " + yearInput + " ������� " + yearNow);
		}
		if (inputDate == dateNow) {
			System.out.println("�� ����� ����������� ����");
		}

	}

}