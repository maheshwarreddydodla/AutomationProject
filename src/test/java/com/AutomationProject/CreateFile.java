package com.AutomationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		
		String filePath="D:\\Desktop\\creatnewfile.txt";
		File file=new File(filePath);
		
		try {
			if(file.createNewFile())
			{
				System.out.println("New File created");
			}
			else
			{
				System.out.println("File is already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file name with location path:");
		String fileName=scanner.nextLine();
		try {
			fos=new FileOutputStream(fileName,true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the Content:");
		String content=scanner.nextLine();
		byte b[]=content.getBytes();
		try {
			fos.write(b);
			fos.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
