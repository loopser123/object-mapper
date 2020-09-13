
package com.nimbleays.mapper.core;

import java.lang.reflect.Field;

public interface ObjectReader {

    public Field[] readObject(Object o); 

}