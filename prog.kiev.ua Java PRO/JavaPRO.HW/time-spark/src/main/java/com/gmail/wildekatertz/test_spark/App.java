package com.gmail.wildekatertz.test_spark;

import static spark.Spark.get;
import java.util.Date;

public class App {
	public static void main(String[] args) {

		get("/time", (req, res) -> gettime());

	}

	private static String gettime() {

		Date date = new Date();
		return date.toString();

	}

}