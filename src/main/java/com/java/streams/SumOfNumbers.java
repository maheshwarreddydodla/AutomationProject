package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3);
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println(sum.get());
	}
}
