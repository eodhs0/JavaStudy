package com.dyson.readwrite;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class readwrite {
	public static void main(String[] args) throws IOException {
		
		// create the file FileWriter 
		FileOutputStream output = new FileOutputStream("c:/users/dyson/desktop/java_workspace/FileReadWrite/out.txt");
		
		// write on the file 
		FileWriter fw = new FileWriter("c:/users/dyson/desktop/java_workspace/FileReadWrite/out.txt");
		for(int i = 1; i < 5; i++) {
			// If you use this way for next line, you have to add \r\n 
			String data = i + "line is inputed.\r\n";
			fw.write(data);
		}
		fw.close();
		
		// Adding contents on the file 
		FileWriter fw2 = new FileWriter("c:/users/dyson/desktop/java_workspace/FileReadWrite/out.txt", true);
		for(int i = 5; i < 8; i++) {
			// If you use this way for next line, you have to add \r\n 
			String data = i + "line is inputed.\r\n";
			fw2.write(data);
		}
		fw2.close(); // close the fw2 object
		
		
		
		// write on the file by using PrintWriter 
		PrintWriter pw = new PrintWriter("c:/users/dyson/desktop/java_workspace/FileReadWrite/out.txt");
		for(int i = 1; i < 5; i++) {
			// If you use this way for next line, you have to use println method
			String data = i + "line is inputed.";
			pw.println(data);
		}
		pw.close(); // close the pw object
		
		// Adding contents on the file 
		PrintWriter pw2 = new PrintWriter(new FileWriter("c:/users/dyson/desktop/java_workspace/FileReadWrite/out.txt", true));
		for(int i = 5; i < 6; i++) {
			// If you use this way for next line, you have to use println method
			String data = i + "line is inputed.";
			pw2.println(data);
		}
		pw2.close(); // close the pw2 object
		
		
		// Read line by line on the file 
		BufferedReader br = new BufferedReader(new FileReader("c:/users/dyson/desktop/java_workspace/FileReadWrite/out.txt"));
		while(true) {			
			String line = br.readLine();
			if(line == null) 
				break;
			System.out.println(line);
		}
		br.close(); // close the br object
		
		output.close(); // close the output object
	}
}
