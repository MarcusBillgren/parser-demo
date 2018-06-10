package com.billgren.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;

import com.billgren.bean.ClinicTest;
import com.billgren.filereader.ReadFile;
import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;

import jdk.nashorn.internal.codegen.TypeMap;
import sun.net.www.content.text.plain;

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
