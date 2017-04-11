package com.nio.bio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress(9999));
		while(true){
			Socket s = ss.accept();
			//�����̴߳���ͻ��˵�����
			new Thread(new ServerThread(s)).start();
		}
	}
}

