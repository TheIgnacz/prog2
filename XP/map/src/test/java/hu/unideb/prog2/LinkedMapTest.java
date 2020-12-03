package hu.unideb.prog2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedMapTest {
	
	@Test
	public void testSize() {
		
		//Given
		LinkedMap<String, String> linkedMap = new LinkedMap<String,String>();
		
		//When
		linkedMap.put("First","Value1");
		linkedMap.put("Second","Value2");
		
		//Then
		assertEquals(linkedMap.size(),2);
		
		//When
		linkedMap.remove("First");
		
		//Then
		assertEquals(linkedMap.size(),1);
	}
	
	@Test
	public void testIsEmpty() {
		
		//Given
		LinkedMap<String, String> linkedMap = new LinkedMap<String,String>();
		
		//When
		linkedMap.put("First","Value1");
		
		//Then
		assertFalse(linkedMap.isEmpty());
		
		//When
		linkedMap.remove("First");
		
		//Then
		assertTrue(linkedMap.isEmpty());
	}
	
	@Test
	public void testContainsKey() {
		
		//Given
		LinkedMap<String, String> linkedMap = new LinkedMap<String,String>();
		
		//When
		linkedMap.put("First","Value1");
		linkedMap.put("Second","Value2");
		
		//Then
		assertTrue(linkedMap.containsKey("First"));
		
		//When
		linkedMap.remove("First");
		
		//Then
		assertFalse(linkedMap.containsKey("First"));
	}
	
	@Test
	public void testContainsValue() {
		
		//Given
		LinkedMap<String, String> linkedMap = new LinkedMap<String,String>();
		
		//When
		linkedMap.put("First","Value1");
		linkedMap.put("Second","Value2");
		
		//Then
		assertTrue(linkedMap.containsValue("Value1"));
		
		//When
		linkedMap.remove("First");
		
		//Then
		assertFalse(linkedMap.containsValue("Value1"));
	}
	
	@Test
	public void testGet() {
		
		//Given
		LinkedMap<String, String> linkedMap = new LinkedMap<String,String>();
		
		//When
		linkedMap.put("First","Value1");
		linkedMap.put("Second","Value2");
		
		//Then
		assertEquals(linkedMap.get("First"), "Value1");
		
		//When
		linkedMap.remove("First");
		
		//Then
		assertNull(linkedMap.get("Value1"));
	}
	
	/*
	@Test
	public void testPut() {
		
		//Given
		LinkedMap<String, String> linkedMap = new LinkedMap<String,String>();
		
		//When
		
		//Then
		assertNotNull(linkedMap.put("First","Value1"));
	}
	
	
	@Test
	public void testRemove() {
		
		//Given
		LinkedMap<String, String> linkedMap = new LinkedMap<String,String>();
		
		//When
		
		//Then
	}
	*/
	
	
	
}
