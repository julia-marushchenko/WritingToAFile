package com.output.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingText {
	
	static String text = "Text to be written to the file";
	
	//Method to write text to file
	public static void writeText(String text) {
		File file = new File("file.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(text);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Method main to run java application
	public static void main(String [] args) {
		
		//Calling method writeText from class Writing text
		WritingText.writeText(text); // file is created, text is written
	}

}
