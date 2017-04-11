package com.nio.bio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BIODemo1 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("1.txt");
		OutputStream out = new FileOutputStream("2.txt");
		
		byte bs [] = new byte[1024];
		int i = -1;
		while((i = in.read(bs))!=-1){
			out.write(bs,0,i);
		}
		
		in.close();
		out.close();
		
	}
}
