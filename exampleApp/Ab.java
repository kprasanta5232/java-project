package org.jmz.exampleApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ab {
	public static void test() throws IOException {
		Map mp=new HashMap<String,String>();
		
		Scanner sc=new Scanner(System.in);
		String str="";
		String val="";
		int result = 0;
		File file=new File("C:\\Users\\prasa\\Desktop\\question.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		while((str=br.readLine())!=null){
			System.out.println(str);
			System.out.println(br.readLine());
			
			String ans=(String) br.readLine().toString();
			String st=sc.nextLine().toString();
		
			if(st.equals(ans))
			{
				result++;
			}
			else {
				System.out.println("Wrong");
			}
		}
		System.out.println("your score is:"+ result);
}
	public static void main(String args[]) throws IOException {
		
		test();
	}
}
