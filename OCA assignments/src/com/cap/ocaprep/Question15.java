package com.cg.ocaprep;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i = 0;
		    for (; i < 2; i = i + 5) {
		      if (i < 5)
		        continue;
		      System.out.println(i);
		    }
		    System.out.println(i);
		  }
}

