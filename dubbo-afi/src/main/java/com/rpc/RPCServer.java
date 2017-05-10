package com.rpc;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class RPCServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress(9998));
		Socket s = ss.accept();
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		ObjectInputStream oin = new ObjectInputStream(in);
		Req req = (Req) oin.readObject();
		int num1 = req.getNum1();
		int num2 = req.getNum2();
		int result = add(num1,num2);
		Resp resp = new Resp();
		resp.setResult(result);
		ObjectOutputStream oout = new ObjectOutputStream(out);
		oout.writeObject(resp);
		oout.close();
		oin.close();
		s.close();
		ss.close();
	}
	
	
	public static int add(int num1,int num2){
		return num1 + num2;
	}
}

