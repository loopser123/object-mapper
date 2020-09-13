package com.nimbleays; 

public class TestClassB {
    
    private String name; 
    private String lastName; 
    private String adress; 

    public void setName(String name){
        this.name = name; 
    }
    public void setLastName(String lastName){
        this.lastName = lastName; 
    }
    public void setAdress(String adress){
        this.adress = adress; 
    }
    public String toString(){
        return this.name+" "+this.lastName+" "+this.adress; 

    }


}