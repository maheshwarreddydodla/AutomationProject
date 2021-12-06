package JavaPrograms;

public class ReverseString {
	
	
	
	public static void main(String[] args) {
		
		String str="ABCDE";
		String rev="";
		
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse String: "+rev );
		
		
		char[] ch=str.toCharArray();
		int len=ch.length;
		String rev2="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev2=rev2+ch[i];
		}
		
		System.out.println("Reverse String: "+rev2);
		
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		StringBuilder sb2=new StringBuilder(str);
		System.out.println(sb2.reverse());
		
		
	}

}
