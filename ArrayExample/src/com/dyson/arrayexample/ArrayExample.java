package com.dyson.arrayexample;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray();
		printArrayList();
	}
	
	public static void printArray() {
		String verbSet[] = new String[4];
		verbSet[0] = "give";
		verbSet[1] = "send";
		verbSet[2] = "help";
		verbSet[3] = "exercise";
		
		for(int i = 0; i < verbSet.length; i++) {
			System.out.println(verbSet[i]);
		}
		System.out.println("----- End of printArray -----");
		System.out.println();
	}
	
	public static void printArrayList() {
		ArrayList<String> tempList = new ArrayList<>();
		tempList.add("data1");
		tempList.add("data2");
		tempList.add("data3");
		tempList.add("data4");
		
		for(int i = 0 ; i < tempList.size(); i++) {
			System.out.println(tempList.get(i));
		}
		
		tempList.remove(3);
		System.out.println("----- After remove index(3) -----");
		
		for(int i = 0 ; i < tempList.size(); i++) {
			System.out.println(tempList.get(i));
		}
		
	}
}
