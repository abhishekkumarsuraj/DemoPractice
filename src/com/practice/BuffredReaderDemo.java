package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffredReaderDemo {

	public static void main(String[] args) throws IOException {
		int count=0;
		FileReader fr=new FileReader("abc.txt");
		@SuppressWarnings("resource")
		BufferedReader br= new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			count++;
			System.out.println(line);
			line=br.readLine();
			
		}
System.out.println(count);
br.close();
	}

}
