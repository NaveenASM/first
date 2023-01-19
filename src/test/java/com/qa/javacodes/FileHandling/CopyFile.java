package com.qa.javacodes.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	
	public static void main(String[] args) {
		copy();

	}
	
	public static void copy() {
		
		try {
			
			File sf = new File(CreateNewFile.source+"naveen.txt");
			File df = new File(CreateNewFile.destination + "copy-naveen.txt");
			
			FileInputStream fi = new FileInputStream(sf);
			FileOutputStream fo = new FileOutputStream(df);
			
			int i=0;
			while((i = fi.read())!=-1) {
				fo.write(i);
			}
			System.out.println("file has copied at :" + CreateNewFile.source);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
