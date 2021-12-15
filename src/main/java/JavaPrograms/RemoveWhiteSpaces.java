package JavaPrograms;

import org.apache.commons.lang.StringUtils;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "     This is a new String  for    testing    ";
		// System.out.println(str.trim());
		// System.out.println(str.replaceAll("\\s+", ""));
//		String rmString=StringUtils.deleteWhitespace(str);
//		System.out.println(rmString);
		
		String noWhiteSpacesString="";
		
//		for(int i=0;i<str.length();i++)
//		{
//			if((str.charAt(i)!=' ')&&(str.charAt(i)!='\t'))
//			{
//				noWhiteSpacesString =noWhiteSpacesString+str.charAt(i);
//			}
//		}
//		
//		System.out.println(noWhiteSpacesString);
		
		
		String[] arr=str.split("\\s");
		StringBuffer sb=new StringBuffer();
		for(String s:arr)
		{
			sb.append(s);
		}
		System.out.println(sb);
		
		
		
	}

}
