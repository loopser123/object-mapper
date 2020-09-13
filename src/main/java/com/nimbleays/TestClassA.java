
package com.nimbleays; 

public class TestClassA {

    private String name ; 
    private String lastName; 
    private String adress; 

    public String getName(){
        return this.name; 
    }
    public String getLastName(){
        return this.lastName; 
    }
    public String getAdress(){
        return this.adress; 
    }
    public TestClassA(String name , String lastName , String adress){
        this.name = name; 
        this.lastName = lastName; 
        this.adress = adress;
    }
    
}