package com.eaglecrk.awarstorm.input;

import java.io.BufferedReader;
import java.io.IOException;



/**
 * Console Input Wrapper for retrieving integer and boolean values from console
 * 
 * @author awarstorm
 *
 */

public class ConsoleInputHandler {

	
	public int getInteger(BufferedReader reader, String inputPrompt) {
		boolean isInteger = false;	
		int intInput = 0;
		
		
		do {
			System.out.println(inputPrompt);
			try {
				String input = reader.readLine();
				 intInput = Integer.parseInt(input);
				 isInteger = true;
			} catch(NumberFormatException e) {
				//e.printStackTrace();
				System.err.println("Invalid Number Format, Expected Integer: " + e.getMessage());
				System.err.println("Please try entering a valid Integer\n");

				isInteger=false;
			}catch (IOException e) {
				//e.printStackTrace();
				System.err.println("Invalid Input: " + e.getMessage());
				System.err.println("Please try entering a valid Integer\n");
				isInteger=false;
			}
			
		} while(!isInteger);
		
		return intInput;
	}
	public boolean getBoolean(BufferedReader reader, String inputPrompt) {
		boolean isValid = false;
		boolean returnValue = false;
		
		do {
			System.out.println(inputPrompt);
			try {
				String input = reader.readLine();
				if( input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes") ) {
					returnValue= true;
					isValid=true;
				} else if( input.trim().equalsIgnoreCase("n") || input.trim().equalsIgnoreCase("no")) {
					returnValue = false;
					isValid=true;
				} else {
					isValid=false;
					System.err.println("Invalid Input");
					System.err.println("Please try entering yes or no\n");
				}
				
			} catch (IOException e) {
				//e.printStackTrace();
				System.err.println("Invalid Input: " + e.getMessage());
				System.err.println("Please try entering yes or no\n");
				isValid=false;
			}
			
		} while( !isValid );
		
		return returnValue;
	}

}
