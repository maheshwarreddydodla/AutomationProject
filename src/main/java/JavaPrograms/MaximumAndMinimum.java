package JavaPrograms;

public class MaximumAndMinimum {
	
	public static void main(String[] args) {
		
		int[] arr= {10,12,56,78,90,30,16,7,800};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			for(int j=1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
				}
				
				
				
			}
			
		}
		
		
		
		System.out.println(max+" "+min);
	}

}
