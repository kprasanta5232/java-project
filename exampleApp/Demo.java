package org.jmz.exampleApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Demo {
	Scanner sc = new Scanner(System.in);
	
	//Home Options Method
	public void options() throws IOException {
		
		System.out.println("Select an option: \n 1)CREATE \t 2) DISPLAY \t 3) RS \t 4) EXIT");
		boolean isValid = false;
		
		int op;
		while (isValid == false) {
	        //System.out.println("Enter age: ");
	        // If input is number execute this,
	        if (sc.hasNextInt()) {
	           op = sc.nextInt();
	            isValid = true;
	            
	            if(op == 1) {
	        		
	    			String name = enterNameAge();
	    			
	    			System.out.println("Type and enter yes for take the Test");
	    			String ask = sc.next();
	    			
	    			
	    			if(ask.toLowerCase ().equals("yes") || ask.toLowerCase ().equals("y") ) {
	    				takeTest(name);
	    			}
	    			else {
	    				wantToContinue();
	    			}
	    			
	    		}
	    			else if(op == 2) {
	    				System.out.println("  You Can Go for other options");
	    				options();
	    				
	    			}
	    			else if(op ==3 ) {
	    			System.out.println(" You Can Go for other options");
	    			options();
	    		}
	    			else if(op==4) {
	    				System.out.println(" You Can Go for other options");
	    				options();
	    			}
	    			
	    			else {
	    				System.out.println("You have entered a wrong input please input from 1 to 4 ");
	    				options();
	    			}
	        // If input is not a number execute this block, 
	        }
	        else {
	            System.out.println("Error! Enter options from 1 to 4");
	        }
	        sc.nextLine();
	    }
		//int op = sc.nextInt();
		}
	//Enter name and Age method
	public String enterNameAge() {
		
		System.out.println("Enter name: ");
		while (!sc.hasNext("[A-Za-z]+")) {
	        System.out.println("Enter a name which contains Alphabets");
	        sc.next();
	    }
		String name = sc.next();
		
		String age="";
		boolean isValid = false;
			System.out.println();
			
			//age = sc.nextInt();
			
			while (isValid == false) {
		        System.out.println("Enter age: ");
		        // If input is number execute this,
		        if (sc.hasNextInt()) {
		            age = sc.next();
		            isValid = true;
		        }
		        // If input is not a number execute this block, 
		        else {
		            System.out.println("Error! Please enter age in numbers");
		        }
		        sc.nextLine();
		    }
			
			System.out.println("Name is "+ name+ "\n Age is "+age);
			//wantToContinue();
			return name;
		}
		
	public void takeTest(String s) throws IOException {
		
		//System.out.println("This is Take test method");
		int n=0;
		String data= null;
		Scanner sc=new Scanner(System.in);
		int score=0;
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prasa\\Desktop\\que.txt"));
		BufferedReader reader = null;
		String value;
		String[] row={};
		
		ArrayList<Questions> set = new ArrayList();
		int c =0;
		while((value = br.readLine()) != null)
		{
			if(c < 10)
			{
			String opt = br.readLine();
			String sArr[] = opt.split(",");
			set.add(new Questions(value,sArr));
			c++;
			}
			else
			{
				value = null;
			}
		}
		Collections.shuffle(set);
		Iterator i = set.iterator();
		int count =0;
		
		while(i.hasNext())
		{
			Questions que = (Questions) i.next();
			System.out.println(que.getQues()+"?");
			System.out.println("choose answer "+"\n(a) "
					+ ""+que.ans[0]+" "+"(b) "+que.ans[1]+" "+"(c) "+que.ans[2]+" "+"(d) "+que.ans[3]);
			String ans = sc.next();
			n++;
			if(que.ans[4].equals(ans))
			{
				
			score++;
			//System.out.println("correct answer");
			}
			else
			{
				//System.out.println("wrong answer");
			}
			//System.out.println(que.toString());
		}
	
		System.out.println(s.toUpperCase()+" Your score is "+score+" /"+n);
		wantToContinue();
	}
	
	//Do you Want to continue method
	public void wantToContinue() throws IOException {
		System.out.println("Do you want to continue: (y/n)");
		String con = sc.next();
		if(con.contains("y")) {
			enterNameAge();
		}
		else {
			System.out.println("\t \t   You are redirected to Home Options");
			
		options();
		}
	}
	public static void main(String args[]) throws IOException {
		System.out.println("wel come online process");
		Demo as = new Demo();
		as.options();
		
	}
}

