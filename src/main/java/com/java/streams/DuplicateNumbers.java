package com.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,1,3,2,4,5,6,6,5,3,7);
		Set<Integer> duplicateList=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(duplicateList);
		
		Set<Integer> dupNum=new HashSet<Integer>();
		Set<Integer> dup=list.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet());
		System.out.println(dupNum);
		System.out.println(dup);
	}
	
	

}