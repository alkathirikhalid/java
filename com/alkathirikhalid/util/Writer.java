package com.alkathirikhalid.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Al-Kathiri Khalid
 * www.alkathirikhalid.com
 * Read & Write a history of
 * type String from & into a file
 */
public final class Writer {
	/**
	 * @throws FileNotFoundException
	 * Writes history list into file
	 */
	public static void write() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\doc.txt"));
		for (String string : History.getHistory())
			pw.println(string);
		pw.close();
	}

	/**
	 * @throws FileNotFoundException
	 * Reads history list from file
	 */
	public static void read() throws FileNotFoundException {
		Scanner scan = new Scanner(new FileInputStream("D:\\doc.txt"));
		while (scan.hasNext()) {
			History.addHistory(scan.next());
		}
		scan.close();
	}
}
