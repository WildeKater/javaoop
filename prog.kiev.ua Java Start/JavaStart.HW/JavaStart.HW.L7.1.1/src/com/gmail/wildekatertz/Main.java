package com.gmail.wildekatertz;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat stf = new SimpleDateFormat("dd.MM.yyyy");

		Date date = new Date();
		Date date2 = new Date();

		System.out.println("Текущая дата");
		String res = stf.format(date);
		System.out.println(res);

		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.MONTH, -1);

		date2 = cl.getTime();

		System.out.println("Дата месяц назад");
		String res2 = stf.format(date2);
		System.out.println(res2);

		System.out.println("Миллисекунд с прошлого месяца");
		System.out.println(date.getTime() - date2.getTime());

	}

}