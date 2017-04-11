package com.nio.bio;

import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket();
		s.connect(new InetSocketAddress("127.0.0.1", 9999));
		
		
		while(true){}
//		OutputStream out = s.getOutputStream();
//		for(int i = 1;i<Integer.MAX_VALUE;i++){
//			System.out.println(i);
//			out.write("a".getBytes());
//		}
//		
//		System.out.println("aaaabbbccc");
	}
}
