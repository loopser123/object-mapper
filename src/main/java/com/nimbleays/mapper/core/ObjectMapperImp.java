package com.nimbleays.mapper.core; 

import java.lang.reflect.Field; 

public class ObjectMapperImp  implements ObjectMapper{

    private  ObjectReader reader; 

    public void mapObject(Object src , Object des) {
        reader = new ObjectReaderImp(); 
        Field[] srcFields = reader.readObject(src); 
        Field[] desFields = reader.readObject(des); 
        for(Field fs : srcFields){
            String srcFieldName = fs.getName(); 
            boolean found = false; 
            for(Field fd :desFields){
                 if(fd.getName().equals(srcFieldName)){
                     found = true; 
                     try {
						fd.set(des, new String("hello"));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
                 }
            }
        }
    }
    
}