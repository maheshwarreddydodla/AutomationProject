package JavaPrograms;

public class PrintOneToHundred {
	
public static void main(String[] args) {
	
	int one='A'/'A';
	String str="..........";
	
	for(int i=one;i<=(str.length()*str.length());i++)
	{
		System.out.print(i+",");
	}
	
	System.out.println();
	
	for(int i=one;i<='d';i+=1)
	{
		System.out.print(i+" ");
	}
}
}
