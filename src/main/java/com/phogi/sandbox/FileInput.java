package com.phogi.sandbox;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * @author avargas
 *  ansi/dos/ascii are all stored as 8 bytes
 */
public class FileInput {
	public static void main (String[] args) {
		
		System.out.printf("%08x", 97);
		
		try (FileInputStream fis = new FileInputStream("resource\\utf16.txt");
				FileOutputStream fos = new FileOutputStream("resource/output.txt")) {
			System.out.println("\nfile found");
			int c = 0;
//			byte [] temp = new byte[6];
//			System.out.println(fis.read(temp));
//			for (byte b : temp) {
//				System.out.println(b + " " );
//			}
			
			
			while ((c = fis.read()) != -1) {
//				System.out.printf("%s %04x %s ", c, c, Integer.toString(c, 2));
				System.out.print(c + " ");
				fos.write(c);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try (FileReader fis = new FileReader("resource\\text.txt")) {
			System.out.println("\nfile found");
			int c = 0;
			while ((c = fis.read()) != -1) {
				System.out.print(c + " ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		
		
	}

}
