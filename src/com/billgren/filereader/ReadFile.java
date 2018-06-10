package com.billgren.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.billgren.bean.ClinicTest;


public class ReadFile {
	
	private BufferedReader bufferedReader;
	
	public ReadFile() {
		
		try {
		bufferedReader = new BufferedReader(new FileReader("sdf.txt"));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
		
	public ArrayList<ClinicTest> readFile() throws IOException {
		
		ArrayList<ClinicTest> tests = new ArrayList<>();
		String currentLine = null;
		
		
		try {
			while((currentLine = bufferedReader.readLine()) != null) {
				
				/*if(currentLine.contains("||")){
					currentLine = currentLine.replace("||", "| null |");
				}*/
				
				String[] values = currentLine.split("[|]");
				
				if(!validateLength(values))
					values = Arrays.copyOf(values, 16);

				tests.add(new ClinicTest(values));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return tests;
	}
	
	private boolean validateLength(String[] array) {
		
		if(array.length != 16) {
			return false;
		}
		
		return true;
	}

}
