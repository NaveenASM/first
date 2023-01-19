package com.qa.javacodes.FileHandling;

import java.io.File;

public class CreateNewFile {

	public static String source = "C:\\Users\\madhun\\OneDrive - Micro Focus\\Documents\\EclipseTarget\\FileHandling\\";
	public static String destination = "C:\\Users\\madhun\\OneDrive - Micro Focus\\Documents\\EclipseTarget\\FileHandling\\";
	
	
	public static void main(String[] args) {
		
		createFile();

	}
	
	public static void createFile() {

		try {
		
			File fs = new File(source+"naveen.txt");
			boolean flag = fs.createNewFile();
			
			if(flag==true) {
				System.out.println("File created successully at:" + " " + source);
			} 
			else {
				System.out.println("File is already present at:" + " " + source);
			}
			
			File fr = new File(source+"naveen.jpg");
			fs.renameTo(fr);   //rename a file
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
