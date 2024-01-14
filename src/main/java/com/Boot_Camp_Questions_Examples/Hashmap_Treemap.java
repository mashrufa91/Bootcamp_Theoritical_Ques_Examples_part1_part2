package com.Boot_Camp_Questions_Examples;

import java.util.HashMap;
import java.util.TreeMap;

public class Hashmap_Treemap {

	public static void main(String[] args) {
		HashMap <Integer, String> hashmap = new HashMap <>();
		hashmap.put(50000, "car");
		hashmap.put(1000, "watch");
		hashmap.put(600000, "land");
		
		
		System.out.println("Hasmap:"+hashmap);
		
		TreeMap <Integer, String> treemap = new TreeMap<>();
		treemap.put(5000, "sky");
		treemap.put(4000, "ocean");
		treemap.put(6000, "land");
		
		System.out.println("Treemap:"+ treemap);
		treemap.forEach((k,v) -> System.out.println("Key = "+ k +" Value = "+v));
		System.out.println(treemap.lastKey());
		System.out.println(treemap.firstKey());
	}
}
