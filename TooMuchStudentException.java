package com.gmail.rezus;

public class TooMuchStudentException extends Exception {

		@Override
	    public String getMessage() {
			return "More than 10 students in group";
	    	
	    }
	    
}
