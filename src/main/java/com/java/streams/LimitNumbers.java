package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 4, 6, 8, 0, 2, 9, 11, 13);
		List<Integer> limitList=list.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitList);
		
		int sum=list.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		List<Integer> sk=list.stream().skip(5).collect(Collectors.toList());
		System.out.println(sk);
		
		int skipSum=list.stream().skip(5).reduce((a,b)->a+b).get();
		System.out.println(skipSum);
		
	}

}
