package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtractionDemo {

	public static void main(String[] args) throws IOException {
		
	@SuppressWarnings("resource")
	PrintWriter pw=new PrintWriter("output.txt");
	BufferedReader br=new BufferedReader(new FileReader("input.txt"));
	String line=br.readLine();
	while(line!=null)
	{
		boolean available=false;
		@SuppressWarnings("resource")
		BufferedReader br1=new BufferedReader(new FileReader("delete.txt"));
		String target=br1.readLine();
		while(target!=null)
		{
		if(line.equals(target))
		{
			available=true;
			break;
		}
		target=br1.readLine();
		}
		if(available==false)
		{
			pw.println(line);
			pw.flush();
		}
		line=br.readLine();
	}
		br.close();
		
		

	}

}
