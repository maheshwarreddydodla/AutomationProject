package JavaPrograms;

public class MaximumAndMinimumTest {
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,45,6,17,10,23,700};
		
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		for(int j=1;j<arr.length-1;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		
		
		System.out.println(max+" "+min);
	}

}
