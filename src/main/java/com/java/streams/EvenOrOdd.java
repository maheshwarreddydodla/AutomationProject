package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,1,2,5,6,9,12,11,10,5);
		
		List<Integer> evenList=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		List<Integer> oddList=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
	}

}
