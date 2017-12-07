package com.eaglecrk.awarstorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.eaglecrk.awarstorm.input.ConsoleInputHandler;
import com.eaglecrk.awarstorm.modules.AddingModule;


/**
 * @author awarstorm
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		boolean again = false;
		BufferedReader reader = null;
		
		try {
			System.out.println("Hello World!\n\n");
	
			reader = new BufferedReader(new InputStreamReader(System.in));
			ConsoleInputHandler H = new ConsoleInputHandler();
			
			do {
			
				int addend1 = H.getInteger(reader, "Enter First Integer");
				int addend2 = H.getInteger(reader, "Enter Next Integer");
				int sum = AddingModule.sum(addend1, addend2);
				
				System.out.println("Sum: " + sum + "\n\n");	
				again = H.getBoolean(reader, "Would you like to add together more numbers? (yes/no)\n");

			} while(again);
			
			System.out.println("Goodbye!\n");	
			
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
