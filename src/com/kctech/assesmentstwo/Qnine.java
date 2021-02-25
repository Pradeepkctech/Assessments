package com.kctech.assesmentstwo;

interface TestInterface 
{ 
    // abstract method 
    public void square(int a); 
  
    // default method 
    default void show() 
    { 
      System.out.println("Default Method Executed"); 
    } 
} 
  
class Qnine implements TestInterface 
{ 

    public void square(int a) 
    { 
        System.out.println(a*a); 
    } 
  
    public static void main(String args[]) 
    { 
       Qnine d = new Qnine(); 
        d.square(4); 
  
       
        d.show(); 
    } 
} 