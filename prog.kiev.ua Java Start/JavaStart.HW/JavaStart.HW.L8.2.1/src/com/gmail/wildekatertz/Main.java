package com.gmail.wildekatertz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String fileName = "New.txt";
		int[][] impArray = importMas(fileName);
		
		for (int i = 0; i < impArray.length; i++) {
			for (int j = 0; j < impArray[i].length; j++) {
				System.out.print(impArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] importMas(String fileName) {
		int[][] imp = null;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String text = "";

			if (sizeArray(fileName) != 0) {
				imp = new int[sizeArray(fileName)][];
			}

			int size = 0;
			for (; (text = br.readLine()) != null;) {
				String[] str = text.split(",");
				int[] tmp = new int[str.length];
				for (int i = 0; i < str.length; i++) {
					tmp[i] = Integer.valueOf(str[i]);
				}
				imp[size] = tmp;
				size++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return imp;

	}

	private static int sizeArray(String fileName) {
		int size = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				size++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return size;
	}

}
