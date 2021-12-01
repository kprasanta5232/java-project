package org.jmz.exampleApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class First 
{

	public static void main(String[] args) throws IOException {
		option();
	}
	public static void option() throws IOException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("choose one option");
		System.out.println("1)CREATE  2)DISPLAY 3)   4)EXIT  ");
		int ch=sc.nextInt();
		if(ch==1) {
			namepassword();
		}
	}
	public static void namepassword() throws IOException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String name="";
		String password="";
		String sts="";
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter password:");
		password=sc.next();
		System.out.println("do tou want tack test (yes/no)");
	    sts=sc.next();
		if(sts.equals("yes")||sts.toLowerCase ().equals("y")) {
			test();
		}
		else {
			option();
		}
		
	}
	
	@SuppressWarnings("resource")
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
			
			String ans=br.readLine();
			System.out.println(ans);
			String st=sc.next().toString();
			ans=ans.toLowerCase();
			st=st.toLowerCase();
			//System.out.println("ans type"+ans.getClass().getName());
			//System.out.println("st  type"+st.getClass().getName());
		
			if(ans.equals(st))
			{
				result++;
			}
			else {
				System.out.println("Wromg");
			}
		}
		System.out.println("your score is:"+ result);
}
//public static boolean valid(String ans,String st) {
//	if(st.equals(ans)) 
//		return true;
//	return false;
//	}
}

