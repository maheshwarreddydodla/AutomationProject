package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(100,456,230,245,500,600,245,275,29);
		
		List<Integer> liWith2=list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(liWith2);
	}

}
