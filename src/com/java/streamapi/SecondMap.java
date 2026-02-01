package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMap {
	public static void main(String[] args) {
		List<Integer> arraysnumbers=Arrays.asList(12,15,16,17,18);
	List<Integer> result=arraysnumbers.stream().map(n->n/2).collect(Collectors.toList());
	System.out.println(result);
	List<String> strings=Arrays.asList(" Java ","Python","ruby");
	
	List<String> result2=strings.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
	System.out.println(result2);
	List<String> result3=strings.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
	System.out.println(result3);
	List<String> result4=strings.stream().map(n->n.trim()).collect(Collectors.toList());
	System.out.println(result4);
	//String.trim() string-oda start & end-la irukkura extra spaces-a remove pannum.
	List<Integer> result5=strings.stream().map(n->n.length()).collect(Collectors.toList());
	System.out.println(result5);
	List<String> result6=strings.stream().map(n->n.trim()).collect(Collectors.toList());
	System.out.println(result6);
	List<String> result7=strings.stream().map(s -> s.substring(2, 4)).collect(Collectors.toList());
	System.out.println(result7);
	List<String> result8=strings.stream().map(s -> s.substring(0, 2)).collect(Collectors.toList());
	System.out.println(result8);

	List<String> result9=strings.stream().map(s -> s.substring(0, 2)).collect(Collectors.toList());
	System.out.println(result9);

	
//		
//	"ruby".substring(0,1)	r	index 0 only
//	"ruby".substring(0,2)	ru	index 0,1
//	"ruby".substring(1,3)	ub	index 1,2
//	"ruby".substring(2,4)	by	index 2,3
	}

}

