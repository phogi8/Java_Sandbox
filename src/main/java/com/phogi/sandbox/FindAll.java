package com.phogi.sandbox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindAll {
	public static void main (String[] args) {
		
		args = new String[] {"resource", "key"};
		
		if (args.length != 2) {
			System.err.println("usage: java FindAll start search-string");
			return;
		}
		
		if (!findAll(new File(args[0]), args[1])) {
			System.err.println("not a directory");
		}
	}
	
	static boolean findAll(File file, String srchText) {
		File[] files = file.listFiles();
		
		if (files == null) {
			return false;
		}
		
		for (int i = 0; i < files.length; i++) {
			System.out.println("Searching: " + files[i].getPath());
			if (files[i].isDirectory()) {
				findAll(files[i], srchText);
			} else {
				if (find(files[i].getPath(), srchText)) {
					System.out.println("Found in " + files[i].getPath());
				}
			}
		}
		return true;
	}
	
	static boolean find(String filename, String srchText) {
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			int ch;
			outer_loop:
			do {
				if ((ch = br.read()) == -1) {  // bug: whatever was read in the for loop is no longer compared to the srchText.charAt(0), use of mark and reset fixes this bug
					return false;
				}
				if (ch == srchText.charAt(0)) {
					br.mark(1000); // the parameter is to set how far ahead can the buffer read without losing the mark
					for (int i = 1; i < srchText.length(); i++) {
						if ((ch = br.read()) == -1) {
							return false;
						}
						if (ch != srchText.charAt(i)) {
							br.reset();
							continue outer_loop;	// bug: continues from the last character read, use of mark and reset fixes this bug
						}
					}
					return true;
				}
			}
			while (true);
		} catch (IOException ioe) {
			System.err.println("I/O error: " + ioe.getMessage());
		}
		
		return false;
	}

}
