package com.AutomationProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	

	
	
	
	public static void main(String[] args) {
		
		copyFile();

	}
	
	public static void copyFile()
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		File inputFile=new File("D:\\Desktop2\\aadhar1.pdf");
		File outputFile=new File("D:\\Desktop2\\aadhar1-copy.pdf");
		
		try {
			fis=new FileInputStream(inputFile);
			fos=new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(fis.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(fis!=null)
			{
				try {
					fis.close();
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
		
		