package com.AutomationProject;

import java.io.File;
import java.util.Arrays;

public class PrintFilesAndDir {

	public static void main(String[] args) {
		
		File file=new File("D://Desktop");
		
		File[] listofFiles=file.listFiles();
		
		Arrays.sort(listofFiles);
		
		for(File e:listofFiles)
		{
			if(e.isFile())
			{
				System.out.println("File: "+e.getName()+" "+e.getAbsolutePath());
			}
			else if(e.isDirectory())
			{
				System.out.println("Directory: "+e.getName()+" "+e.getAbsolutePath());
			}
			else
			{
				System.out.println("Other: "+e.getName()+" "+e.getAbsolutePath());
			}
		}


	

	}

}
