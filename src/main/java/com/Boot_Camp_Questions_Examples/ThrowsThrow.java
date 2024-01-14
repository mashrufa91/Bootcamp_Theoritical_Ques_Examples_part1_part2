package com.Boot_Camp_Questions_Examples;

public class ThrowsThrow {

	int checkMarks(int marks) throws ArithmeticException
	  {  
		    int result= marks/0;
		    return result; 
	  }
	  public static void main(String args[])
	  {  
		  ThrowsThrow object = new ThrowsThrow();
	    try
	    {
		    System.out.println (object.checkMarks(43)); 
	    }  
	    catch(ArithmeticException except)
	    {
		    System.out.println("Error in dividing number by zero");
	    } 
	  }
	}



