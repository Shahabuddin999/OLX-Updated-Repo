package com.zensar;

import java.util.stream.Collectors;
import java.util.*;
import java.util.function.Function;

public class CountOccuranceOfChar3 {
	public static void main(String args[]) {
		String str = "Communication".toLowerCase();
		List<String> list = Arrays.asList(str.split(""));
		Map<String,Integer> map = list.stream().collect(Collectors.toMap(Function.identity(),initialValue->1, Math::addExact));
		System.out.println(map);
		
	}
}