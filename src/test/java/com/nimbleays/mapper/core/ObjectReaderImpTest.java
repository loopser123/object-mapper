package com.nimbleays.mapper.core;



import java.lang.reflect.Field;

import org.junit.Test;

import com.nimbleays.TestClassA;

import junit.framework.TestCase;


public class ObjectReaderImpTest  extends TestCase {
	
	
	
	@Test
	public void testReadObjectASimpleObject() {
		ObjectReaderImp objectReader = new ObjectReaderImp(); 
		TestClassA a = new TestClassA("hamid","hamid","hamid"); 
	    Field[] testObjectFields = objectReader.readObject(a); 
		assertEquals(3,testObjectFields.length);
			
	}

}
