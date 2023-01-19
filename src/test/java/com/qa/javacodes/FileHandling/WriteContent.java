package com.qa.javacodes.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteContent {

	static FileOutputStream fo = null;
	public static void main(String[] args) {
		

		content();
	}
	
	public static void content() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr file name with complete path");
		String s = sc.nextLine();
		
		try {
		File f = new File(s);
		f.createNewFile();  //create a new file
		
		System.out.println("Enetr content to the created file");
	
		String cont = sc.nextLine();
		byte[] fb = cont.getBytes();
		
		fo = new FileOutputStream(f);
		fo.write(fb);       //writing contents:
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
