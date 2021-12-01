package org.jmz.exampleApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File1 {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\prasa\\Desktop\\question.txt");
		Scanner sc=new Scanner(file);
		while (sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}
		
	}
}
