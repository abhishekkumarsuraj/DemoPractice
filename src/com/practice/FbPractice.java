package com.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FbPractice {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
        bw.write("I love Programming .");
        bw.newLine();
        bw.newLine();
        bw.write("I love Macbook Air .");
        bw.flush();
        bw.close();
        
				
	}

}
