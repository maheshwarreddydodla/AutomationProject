package JavaPrograms;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a=12;
		int b=13;
	
		
		System.out.println("Before Swaping: "+a +" "+b);
		
		// First way
		
		
//		int temp=a;
//		a=b;
//		b=temp;
		
//		a=a+b;   //a=25
//		b=a-b;   //b=12
//		a=a-b;   //a=13
		
		
//		
//		a=a*b;  //156
//		b=a/b;  //12
//		a=a/b;  //13
		
		
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		
		
		b=a+b-(a=b);
		System.out.println("After Swaping: "+a+" "+b);
		
		

		
	}

}
