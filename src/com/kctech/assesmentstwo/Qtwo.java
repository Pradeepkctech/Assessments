package com.kctech.assesmentstwo;
interface NewInterface { 
	  
    // static method 
    static void hello() 
    { 
        System.out.println("Static method"); 
    } 
  
     
    void overrideMethod(String str); 
} 
  

public class Qtwo implements NewInterface { 
  
    public static void main(String[] args) 
    { 
        Qtwo demo= new Qtwo(); 
  
        // Calling the static method of interface 
        NewInterface.hello(); 
  
        // Calling the abstract method of interface 
        demo.overrideMethod("abtract method"); 
    } 
  
    // Implementing interface method 
  
    @Override
    public void overrideMethod(String str) 
    { 
        System.out.println(str); 
    } 
} 

