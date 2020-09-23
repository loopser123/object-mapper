
package com.nimbleays.mapper.core; 

import java.lang.reflect.Field;
import java.util.Map; 
// initial Assumption : we suppose we are dealing only with simple fields (no complex ds for the moment)


public class ObjectReaderImp implements ObjectReader{



	public Field[] readObject(Object o) {
		return o.getClass().getDeclaredFields(); 
    }
    
	public Map<?,?> readObjectsValues(Object o ){
		
		Field[] objectsFields = readObject(o); 
		// get getter from the Object o 
		// invoke getters to get there values
		// construct the map object s
		return null;
	}
  
    
}