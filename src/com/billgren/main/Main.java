package com.billgren.main;

import java.io.IOException;
import java.util.List;

import com.billgren.bean.ClinicTest;
import com.billgren.database.DatabaseConncector;
import com.billgren.parser.ReadFile;


public class Main {

	public static void main(String[] args) {

		DatabaseConncector conn = new DatabaseConncector("postgres", "letmein123"); 
		ReadFile rFile = new ReadFile();
		List<ClinicTest> temp;
				
		try {
			//temp is just for testing purposes
			temp = rFile.readFile();
			//Print out parsing to console for confirmation
			//temp.forEach(c -> System.out.println(c.toString()));
			
			conn.connectToDB();
			
			if(conn.addResult(rFile.readFile()));
				conn.closeConnection();
			

		} catch (IOException e) {
			e.printStackTrace();
		}

		


		
		
		


	}

}
