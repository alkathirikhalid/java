package com.alkathirikhalid.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Al-Kathiri Khalid
 * www.alkathirikhalid.com
 * Hold a history of type
 * String into an Array list
 */
public final class History {
	private static List<String> history = new ArrayList<String>();

	/**
	 * @return
	 * The elements in the list
	 */
	public static List<String> getHistory() {
		return history;
	}

	/**
	 * @param string
	 * Add an element to list
	 */
	public static void addHistory(String string) {
		history.add(string);
	}

	/**
	 * Clear all elements in the list
	 */
	public static void clearHistory() {
		history.clear();
	}

	/**
	 * @return
	 * The number of elements in the list
	 */
	public static int sizeOfHistory() {
		return history.size();
	}
}
