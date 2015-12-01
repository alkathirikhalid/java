package com.alkathirikhalid.util;

import java.io.IOException;

/**
 * @author Al-Kathiri Khalid
 * www.alkathirikhalid.com
 * Test application
 */
public class Application {

	public static void main(String[] args) throws IOException {
		// Clear history in memory
		History.clearHistory();
		
            try {
            	// Loads history from file
                Writer.read();
            } catch (FileNotFoundException e){
            	// If file not found then create
                Writer.write();
            	}
		
		// Add items to history list in memory
		History.addHistory("1");
		History.addHistory("2");
		
		// Print new history list in memory
		for (String string : History.getHistory()) {
			System.out.println(string);
		}
		
		// Print history size list in memory
		System.out.print(History.sizeOfHistory());
		
		// Saves new history to file
		Writer.write();

	}
}
