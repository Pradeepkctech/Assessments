package com.kctech.assesmentsthree;
interface Interface1 
{ static void print() 
{ 
	System.out.print("Hello"); 
} 
} 
interface Interface2 

{ static void print()
	
{ 
	System.out.print("World!");
	
} 
}
public class Qfive implements Interface1,Interface2 {

	public static void main(String[] args) {
		Interface1.print();
		System.out.print(" ");
		Interface2.print();

	}

}
