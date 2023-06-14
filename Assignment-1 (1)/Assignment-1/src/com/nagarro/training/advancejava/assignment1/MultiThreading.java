package com.nagarro.training.advancejava.assignment1;

import java.util.ArrayList;
import java.util.Comparator;

public class MultiThreading extends Thread {
	ArrayList<String> str;
	ArrayList<TSHIRT> list = new ArrayList<>();

	String colour;
	String size;
	String gender;
	String preference;
	int change = 0;
	CSVReader csv = new CSVReader();

	public void Input(ArrayList<String> str, String colour, String size, String gender, int op) {
		this.str = str;
		this.colour = colour;
		this.gender = gender;
		this.size = size;
		if (op == 1)
			this.preference = "price";
		else if (op == 2)
			this.preference = "rating";
		else if (op == 3)
			this.preference = "both";
	}

	volatile boolean flag = true;

	@Override
	public void run() {
		int count = 0;
			// Do your task
			list = csv.init(str);// list comes to this list"all content of csv file"
			ArrayList<TSHIRT> op = new ArrayList<TSHIRT>();
			for (TSHIRT i : list) {
				// i.showAttributes();
				if (i.getGender().equalsIgnoreCase(gender) && i.getColour().equalsIgnoreCase(colour)
						&& i.getSize().equalsIgnoreCase(size))
					op.add(i);
			}
			/*
			 * if(this.preference=="rating") op.sort(Comparator.comparing(a ->
			 * a.getRating()));
			 * 
			 * if(this.preference=="price") op.sort(Comparator.comparing(a ->
			 * a.getPrice()));
			 * 
			 * if(this.preference=="both") op.sort(Comparator.comparing ( (a ->
			 * a.getPrice())));
			 */

			if (op.isEmpty()) {
				System.out.print("Sorry not item is found!!");

			} else {

				System.out.println("------------As per choice---------------------");
				System.out.println(
						"================================================================================================================================================");
				for (TSHIRT i : op) {
					i.showAttributes();
				}
				System.out.println(
						"================================================================================================================================================");
				count = 1;
			}

			try {
				// Thread.sleep(5000);
			} catch (Exception e) {

			}

		}
	}
