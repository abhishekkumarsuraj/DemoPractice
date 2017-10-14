package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MeargeTwoFilesContextDemo {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		PrintWriter pw=new PrintWriter("abc2.txt");
		BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
		String line1=br1.readLine();
		while(line1!=null)
		{
			pw.println(line1);
			line1=br1.readLine();
		}
		br1.close();
		
		
        @SuppressWarnings("resource")
		BufferedReader br2=new BufferedReader(new FileReader("abc1.txt"));
        String line2=br2.readLine();
        while(line2!=null)
        {
        	pw.println(line2);
        	line2=br2.readLine();
        }
        pw.flush();
        br2.close();
        pw.close();
        
        
        
	}

}
