package JavaPrograms;

import java.util.stream.IntStream;

public class PrintNumbersWithoutLoop {
	public static void main(String[] args) {
		printNum(1);
		System.out.println();
		printNum(1,100);
		System.out.println();
		IntStream.range(1, 101).forEach(e->System.out.print(e+","));

	}
	
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.print(num+",");
			num++;
			printNum(num);
		}
	}
	
	public static void printNum(int startNum,int endNum)
	{
		if(startNum<=endNum)
		{
			System.out.print(startNum+",");
			startNum++;
			printNum(startNum);
		}
	}
}
