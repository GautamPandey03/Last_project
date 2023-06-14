package com.nagarro.training.advancejava.assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

 
public class CSVReader {
	public ArrayList<TSHIRT> init(ArrayList<String> st) {
		ArrayList<TSHIRT> tshirt=new ArrayList<>();
		ArrayList<String> list=new ArrayList<>();
		
		BufferedReader bfr = null;
		
		try {
			String[] string = new String[st.size()];
			 
			 
	        for (int i = 0; i < st.size(); i++) {
	            string[i] = st.get(i);
	        }
	 
	        // Printing using for each loop
	        for (String str : string) {
	        	    
			bfr = new BufferedReader(new FileReader(str));
			int count=0;
			// to read file in java line by line
			while ((str = bfr.readLine()) != null) {
				if (count==0) {
					count+=1;
					continue;
				}
			
				list.addAll(CSVtoArrayList(str));
			}
			}
	        
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bfr != null) bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		String id = null ;
		String name = null;
		String colour = null;
		String gender = null ;
		String size = null;
		float price = (float) 0.00;
		float rating = (float) 0.0;
		String availability = null;
		
		for (String i:list) {
			String[] st1 = i.split("[|]");
			
			for (int j = 0; j < st1.length; j++) {
	            
				if (j==0)
	            	id=(st1[j]);
	            else if (j==1)
	            	name=(st1[j]);
	            else if (j==2)
	            	colour=(st1[j]);
	            else if (j==3)
	            	gender=(st1[j]);
	            else if (j==4)
	            	size=(st1[j]);
	            else if (j==5)
					try {
						price=(Float.valueOf(st1[j]));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						
					}
				else if (j==6)
					try {
						rating=(Float.valueOf(st1[j]));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						
					}
				else if (j==7)
	            	availability=(st1[j]);
	        }
			

			TSHIRT T1=new TSHIRT(id,name,colour,gender,size,price,rating,availability);
			tshirt.add(T1);
			
			
		}

		return tshirt;
	}
	
	// Utility which converts CSV to ArrayList using Split Operation
	public static ArrayList<String> CSVtoArrayList(String str) {
		ArrayList<String> op_str = new ArrayList<String>();
		
		if (str != null) {
			String[] splitData = str.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					op_str.add(splitData[i].trim());
				}
			}
		}
		
		return op_str;
	}
	
}