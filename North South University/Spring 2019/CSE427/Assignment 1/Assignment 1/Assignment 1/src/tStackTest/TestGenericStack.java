package tStackTest;

import org.junit.Test;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.Arrays;
//import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)


public class TestGenericStack {
 Integer value;
 
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}*/
 
 public TestGenericStack(int value){
	 this.value = value;
 }
	
	@DataPoints
	public static String[] inputAsString ={"haha","lala","blabla"};
	
	
	
public GenericStack<String> obj = new GenericStack<String>();
public GenericStack<Double> obj1 = new GenericStack<Double>();
	@Test
	/*public void testPeek() {
		String txt = "Hello";
		obj.push(txt);
		assertEquals(obj.peek(),txt);
	}*/
	public void testLIFO(){
		String txt = "There";
		String txt1 = "Hey";
		obj.push(txt1);
		obj.push(txt);
		assertEquals(obj.pop(), txt);
	}
	@Test
	public void testIsEmpty(){
		obj.empty();
		
		assertTrue(obj.isEmpty());
	}

	@Test
	public void testPush(){
		int noOfPushes = 10;
				for(int i=0; i<noOfPushes; i++){
					obj.push("Haha");
					
				}
				assertEquals(obj.size, noOfPushes);
		
	}
	
	@Test
	public void newStackisEmpty(){
		obj.size=0;
		assertTrue(obj.isEmpty());
	}
	
	
	@Test
	public void testPop(){
		obj1.push(3.14);
		obj1.push(null);
		assertEquals(null,obj.pop());
	}
	
	
	
	
	
	
	
	
	
	@Theory
	public void testPushingString(String value) throws Exception{
		System.out.println(value);
		
		assertEquals(value,obj.push(value));
	}
		
	
	
	}
	
	



