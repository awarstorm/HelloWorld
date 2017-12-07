package com.eaglecrk.awarstorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.eaglecrk.awarstorm.input.ConsoleInputHandler;
import com.eaglecrk.awarstorm.modules.AddingModule;

public class HelloWorld {

	public static void main(String[] args) {
		boolean again = false;
		System.out.println("Hello World!");
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ConsoleInputHandler H = new ConsoleInputHandler();
		
		do {
		
			int addend1 = H.getInteger(reader, "Enter First Integer");
			int addend2 = H.getInteger(reader, "Enter Next Integer");
			int sum = AddingModule.sum(addend1, addend2);
			
			System.out.println("Sum: " + sum);	
			System.out.println("");
			again = H.getBoolean(reader, "Would you like to add together more numbers?");
			
			System.out.println("");
		} while(again);
		
		System.out.println("Goodbye!");
			

	}

}
