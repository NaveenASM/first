package com.qa.javacodes.FileHandling;

import java.io.File;
import java.util.Arrays;

public class FilesinFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fileslist();
	}
	
	public static void fileslist()
	{
		File f = new File(CreateNewFile.source);
		File fa[] = f.listFiles();
		
		Arrays.sort(fa);
		
		for(File fs : fa) {
			if(fs.isFile()) {
				System.out.println("File is :" + " "+ fs.getName()+ " " + "AT" + CreateNewFile.source);
			}else if(fs.isDirectory()) {
				System.out.println("Directory is :" + " "+ fs.getName()+ " " + "AT" + CreateNewFile.source);
			
			}
		}
		
	}

}
