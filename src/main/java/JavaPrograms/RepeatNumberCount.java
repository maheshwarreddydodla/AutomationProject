package JavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class RepeatNumberCount {
	
	
	public static void getDigitCount(long number)
	{
		HashMap<Long,Integer> digitMap=new HashMap<Long,Integer>();
		
		while(number!=0)
		{
			long lastDigit=number%10;
			if(digitMap.containsKey(lastDigit))
			{
				digitMap.put(lastDigit, digitMap.get(lastDigit)+1);
				
			}
			else
			{
				digitMap.put(lastDigit, 1);
			}
			number=number/10;
		}
		
		Set<Long> keySet=digitMap.keySet();
		for(long key:keySet)
		{
			System.out.println(key+":"+digitMap.get(key));
		}
		
		
	}
	public static void main(String[] args) {
		getDigitCount(1211);
	}

}
