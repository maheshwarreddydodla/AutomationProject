
public class MaxAndMinOfThreePositiveNumbers {
	
	
	
	public static void maxNumber(int a,int b,int c)
	{
//		if(a>b&&a>c)
//		{
//			System.out.println("a is max number: "+a);
//		}
//		else if(b>a&&b>c)
//		{
//		System.out.println("b is max number: "+b );	
//		}
//		else
//		{
//			System.out.println("C is max number:" +c);
//		}
		
		int max=0;
		while(a>0||b>0||c>0)
		{
		
			a--;
			b--;
			c--;
			max++;
		}
		
		System.out.println(max);
		
	}
	
	public static void minNumber(int a,int b,int c)
	{
//		if(a<b&&a<c)
//		{
//			System.out.println("a is max number: "+a);
//		}
//		else if(b<a&&b<c)
//		{
//		System.out.println("b is max number: "+b );	
//		}
//		else
//		{
//			System.out.println("C is max number:" +c);
//		}
		int min=0;
		while(a>0&&b>0&&c>0)
		{
		
			a--;
			b--;
			c--;
			min++;
		}
		
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		//maxNumber(5,3,2);
		minNumber(5,3,2);
		
	}

}
