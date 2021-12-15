package JavaPrograms;

public class StringToNumber {
	
	
	public static int convertToInt(String str)
	{
		int len=str.length();
		int num=0;
		for(int i=0;i<len;i++)
		{
			num=num*10+((int)str.charAt(i)-48);
		}
		
		return num;
	}
	
	public static int stringToInt(String str)
	{
		if(str.length()==1)
		{
			return (int)str.charAt(0)-48;
		}
	
		char ch[]=str.toCharArray();
		int sum=0;
		int zeroasc=(int)'0';
		for(int i=0;i<ch.length;i++)
		{
			int asc=(int)ch[i];
			sum=sum*10+(asc-zeroasc);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(convertToInt("123")+10);
		System.out.println(stringToInt("1")+10);
	}

}
