package com.rpc;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class RPCClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket();
		s.connect(new InetSocketAddress("127.0.0.1",9998));
		OutputStream out  = s.getOutputStream();
		InputStream in = s.getInputStream();
		//返回结果
		Req req = new Req();
		req.setNum1(5);
		req.setNum2(6);
		//2.返回结果
		ObjectOutputStream oout = new ObjectOutputStream(out);
		//3.回写
		oout.writeObject(req);
		//写入值
		ObjectInputStream oin = new ObjectInputStream(in);
		Resp resp = (Resp) oin.readObject();
		//5.返回结果
		System.out.println("返回结果"+resp.getResult());
		
		//刷新
		oout.close();
		oin.close();
		s.close();
	}
}
