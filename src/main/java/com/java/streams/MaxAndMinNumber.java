package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 7, 8, 10, 20, 21, 27,-1,0);
		
		int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max Number: "+max);
		
		int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min Number: "+min);
	}

}
