package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
	
		System.out.print("Enter a number:");
		int num=scanner.nextInt();
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse number: "+ rev);
		
		
		
		StringBuffer revNum;
		
		
		System.out.print("Enter a number:");
		int num2=scanner.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(num2));
		revNum=sb.reverse();
		System.out.println("Reverse number: "+revNum);
		
		System.out.print("Enter a number:");
		int num3=scanner.nextInt();
		StringBuilder revNum3;
		
		StringBuilder sb2=new StringBuilder(String.valueOf(num3));
		revNum3=sb2.reverse();
		System.out.println("Reverse number: "+revNum3);
		
		
		
		
		
	}
	
	
	

}
