package com.cg.ocaprep;

//String objects are immutable.
public class Question5 {

	public static void main(String[] args)
	{
		String s = "java2s"; 
        s.replace('a', 'Z').trim().concat("Aa"); 
        s.substring(0, 2); 
        System.out.println(s); 
	}

}
