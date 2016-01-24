/**
 * 
 */
package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hp
 *
 */
public class PathSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PathSearch().readInputFile();
	}

	public void readInputFile() {
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("input.txt")));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
