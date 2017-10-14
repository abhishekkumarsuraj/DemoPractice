package com.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc1.txt",true);
		PrintWriter out=new PrintWriter(fw);
		//out.println("I want to be a geek of Programming .");
		//out.println(true);
		out.println("I love Indigeneous Products .");
		out.flush();
		out.close();
	}

}
