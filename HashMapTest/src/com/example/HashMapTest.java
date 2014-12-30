package com.example;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.Test;

import junit.framework.TestCase;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class HashMapTest extends TestCase{

	public static long keySet;
	public static long entrySet;
	
	@Test
	public void testKetSet(){
		HashMap hashmap = new HashMap();
		for (int i = 0; i < 1000000; i++) {
			hashmap.put("" + i, "thanks");
		}

		long bs = Calendar.getInstance().getTimeInMillis();
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
			String x = (String) hashmap.get(iterator.next());
			// System.out.print(hashmap.get(iterator.next()));
		}
		System.out.println();
		// System.out.println(Calendar.getInstance().getTimeInMillis() - bs);
		keySet = Calendar.getInstance().getTimeInMillis() - bs;
		
		System.out.println("keySet  :" + keySet);
	}
	
	@Test
	public void testEntrySet(){
		java.util.HashMap hashmap = new java.util.HashMap();
		for (int i = 0; i < 1000000; i++) {
			hashmap.put("" + i, "thanks");
		}
		long bs = Calendar.getInstance().getTimeInMillis();
		java.util.Iterator it = hashmap.entrySet().iterator();
		while (it.hasNext()) {
			java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
			// entry.getKey() 返回与此项对应的键
			// entry.getValue() 返回与此项对应的值
			String x = (String) entry.getValue();
			// System.out.print(entry.getValue());
		}
		System.out.println();
		// System.out.println(Calendar.getInstance().getTimeInMillis() - bs);
		entrySet = Calendar.getInstance().getTimeInMillis() - bs;
		
		System.out.println("entrySet:" + entrySet);
	}

	// Map<String, String> map = new HashMap<>();
	// Iterator iterator = map.keySet().iterator();
	// while (iterator.hasNext()) {
	// Object key = iterator.next();
	// String value = map.get(key);
	// }

	// Map<String, String> map = new HashMap<>();
	// Iterator iterator = map.entrySet().iterator();
	// while(iterator.hasNext()){
	// Entry entry = (Entry) iterator.next();
	// Object key = entry.getKey();
	// Object value = entry.getValue();
	// }

}