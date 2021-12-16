package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3);
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
	}
}
