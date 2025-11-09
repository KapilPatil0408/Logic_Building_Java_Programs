package com.collection_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {

	public static void main(String[] args) {
		
		List<String> al= Arrays.asList("kapil", "madhav", "nikhil", "mahesh");
		
		
		List<String> as =al.stream().filter(n -> n.startsWith("m")).collect(Collectors.toList());
		System.out.println(as);
		
		al.stream().filter(n -> n.startsWith("m")).forEach(System.out::println);
		

	}

}
