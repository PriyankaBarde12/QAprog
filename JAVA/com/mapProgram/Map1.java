package com.mapProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		m.put(1,"Priyanka");
		m.put(2,"Roy");
		m.put("abc",345);
		m.put(5,"Ram");
		m.put(null,null);
		m.put(6, null);
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());

	}

}
