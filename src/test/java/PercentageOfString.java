import java.text.DecimalFormat;

import org.apache.poi.ss.usermodel.DataFormatter;

public class PercentageOfString {

	
	
	public static  void getCharPercentage(String str)
	{
		
		int len=str.length();
		int upperCount=0;
		int lowerCount=0;
		int digitsCount=0;
		int specCount=0;
		
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerCount++;
			}
			else if(Character.isDigit(ch))
			{
				digitsCount++;
			}
			else
			{
				specCount++;
			}
			
		}
		
		
		
	System.out.println("upper count: "+upperCount);
	System.out.println("upper count: "+lowerCount);
	System.out.println("upper count: "+digitsCount);
	System.out.println("upper count: "+specCount);
	
	DecimalFormat df=new DecimalFormat("##.##");
	
	
	System.out.println("upper count per: "+df.format((upperCount*100.0)/len));
	System.out.println("upper count per: "+df.format((lowerCount*100.0)/len));
	System.out.println("upper count per: "+df.format((digitsCount*100.0)/len));
	System.out.println("upper count per: "+df.format((specCount*100.0)/len));
	
		
	}
	
	public static void main(String[] args) {
		getCharPercentage("Mahesh123");
	}
	
	
	
}
