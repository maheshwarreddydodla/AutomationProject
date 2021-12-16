package com.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortOrder {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,6,8,0,2,9,11,13);
		
		List<Integer> ascOrder=list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascOrder);
		
		List<Integer> descOrder=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descOrder);
		
	}

}
