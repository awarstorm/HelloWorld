package com.eaglecrk.awarstorm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.eaglecrk.awarstorm.AddingModule;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter First Integer");
			int int1 = Integer.parseInt(reader.readLine());
			System.out.println("Enter Next Integer");
			int int2 = Integer.parseInt(reader.readLine());
			int sum = AddingModule.sum(int1, int2);
			System.out.println("Sum: " + sum);			
		}catch(NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Invalid Number Format, Expected Integer: " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Caught IOException: " + e.getMessage());
		}

	}

}
