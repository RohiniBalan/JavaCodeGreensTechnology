package org.collection;
import java.util.*;
import java.util.Map.Entry;

public class MapTask {
	public static void main(String[] args) {
		
		//HashMap (it accept 1 null in key and n null in values)
		Map <String,Integer> m=new HashMap();
		m.put("Apple", 5);
		m.put("Mango",9);
		m.put("Orange", 8);
		m.put("Pineapple", 6);
		m.put("Papaya", 2);
		m.put("Jackfruit", 3);
		m.put(null, 4);
		m.put("Strawberry", null);
		m.put("Gauva", null);
		System.out.println(m);
		
		//LinkedHashMap (it accept 1 null in key and n null in values)
		Map <String,Integer> m1=new LinkedHashMap();
		m1.put("Apple", 5);
		m1.put("Mango",9);
		m1.put("Orange", 8);
		m1.put("Pineapple", 6);
		m1.put("Papaya", 2);
		m1.put("Jackfruit", 3);
		m1.put(null, 4);
		m1.put("Strawberry", null);
		m1.put("Gauva", null);
		System.out.println(m1);
		
		//TreeMap (it ignores null in key and accept n null in values )
		Map <String,Integer> m3=new TreeMap();
		m3.put("Apple", 5);
		m3.put("Mango",9);
		m3.put("Orange", 8);
		m3.put("Pineapple", 6);
		m3.put("Papaya", 2);
		m3.put("Jackfruit", 3);
		System.out.println(m3);
		
		//HashTable (it ignores null in both key and value)
		Map <String,Integer> m4=new Hashtable();
		m4.put("Apple", 5);
		m4.put("Mango",9);
		m4.put("Orange", 8);
		m4.put("Pineapple", 6);
		m4.put("Papaya", 2);
		m4.put("Jackfruit", 3);
		System.out.println(m4);
		
		// Methods of Map
		int size = m.size();
		System.out.println(size);
		
		boolean containsKey = m.containsKey("Apple");
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(null);
		System.out.println(containsValue);
		
		Integer remove = m.remove(null);
		System.out.println(remove);
//		System.out.println(m);
		
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m.values();
		System.out.println(values);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String,Integer> a:entrySet) {
			System.out.println(a);
			
		    String key = a.getKey();
		    System.out.println(key);
		    
		    Integer value = a.getValue();
		    System.out.println(value);
		}
	}
}
