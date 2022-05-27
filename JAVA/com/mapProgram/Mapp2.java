package com.mapProgram;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapp2 {
	public static void main(String[] args) {
		Map m=new LinkedHashMap();
				m.put(1, "Manisha");
				m.put(2,"Prajkta");
				m.put(5,"Mayank");
				System.out.println(m);
				Set set=m.entrySet();
				Iterator itr=set.iterator();
				while(itr.hasNext()) {
					Map.Entry map=(Map.Entry)itr.next();
					System.out.println("Values are : "+map.getValue()+"---------------"+" Key are "+map.getKey());
					
				}
				
	}


}
