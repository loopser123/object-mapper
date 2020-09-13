
package com.nimbleays.mapper.core; 

import java.lang.reflect.Field; 
// initial Assumption : we suppose we are dealing only with simple fields (no complex ds for the moment)


public class ObjectReaderImp implements ObjectReader{



	public Field[] readObject(Object o) {
		return o.getClass().getDeclaredFields(); 
    }
    
  
    
}