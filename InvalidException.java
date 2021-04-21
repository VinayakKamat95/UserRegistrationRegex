package com.bridgelabz;

/*Custom exception created which extends (parent) Exception class*/
public class InvalidException extends RuntimeException{
	
	public InvalidException(String message){  
		  super(message);  
		 } 

}
