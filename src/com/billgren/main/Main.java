package com.billgren.main;

import java.io.IOException;
import java.util.ArrayList;

import com.billgren.bean.ClinicTest;
import com.billgren.filereader.ReadFile;


public class Main {

	public static void main(String[] args) {

		ReadFile rFile = new ReadFile();
		ArrayList<ClinicTest> temp;
				
		try {
			temp = rFile.readFile();
			
			//Print out parsing to console for confirmation
			temp.forEach(c -> System.out.println(c.toString()));
			
			
			//TODO: Add ClinicTests data to database

		} catch (IOException e) {
			e.printStackTrace();
		}

		


		
		
		


	}

}
