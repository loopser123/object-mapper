package com.nimbleays;

import com.nimbleays.mapper.core.ObjectMapperImp;
import com.nimbleays.mapper.core.ObjectMapper; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ObjectMapper mapper = new ObjectMapperImp(); 
        TestClassA ta = new TestClassA("hamid","robbio","32Narj");
        TestClassB tb = new TestClassB(); 
        
        try {
			 mapper.mapObject(ta,tb);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        System.out.println(tb); 
    }
}
