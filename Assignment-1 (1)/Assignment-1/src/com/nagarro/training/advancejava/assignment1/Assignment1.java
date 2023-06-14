package com.nagarro.training.advancejava.assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 extends Thread {
	static ArrayList<String> str = new ArrayList<>();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String ch = null;
		boolean flag = true;
		
		do {
			System.out.println("Enter the options:");
			System.out.println("Enter the Colour:");
			String colour = sc.nextLine();
			System.out.println("Enter the Size:(S/M/L/XL/XXL)");
			String size = sc.nextLine();
			System.out.println("Enter the Gender:(M/F/U)");
			String gender = sc.nextLine();
			System.out.println("Enter the basis for output preference:\n1)Price\n2)Rating\n3)Both");
			int op = sc.nextInt();

			String directory = "D:\\Tshirt";
			File[] files = new File(directory).listFiles();//
			for (File file : files) {
				if (file.isFile()) {
					str.add(file.getAbsolutePath());//add the absolute path to arraylist
					System.out.println(file.getAbsolutePath());
				}
			}
			MultiThreading mt = new MultiThreading();
			mt.Input(str, colour, size, gender, op);

			mt.run();
			System.out.println("Do you want to add more files(Y/N)");
			ch = sc.nextLine();

		} while (flag == true);

		// mt.AddData(path,change);

	}

}