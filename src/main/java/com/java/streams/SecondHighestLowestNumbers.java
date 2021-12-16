package com.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 4, 6, 8, 0, 2, 9, 11, 13,4,6,10);
		int secondHighest=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHighest);
		
		int secondLowest=list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondLowest);
		
	}

}
