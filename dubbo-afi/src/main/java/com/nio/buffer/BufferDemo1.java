package com.nio.buffer;

import java.nio.ByteBuffer;

public class BufferDemo1 {
	public static void main(String[] args) {

		ByteBuffer buf = ByteBuffer.allocate(1024);
//		System.out.println(buf.position());
//		System.out.println(buf.limit());
//		System.out.println(buf.capacity());
		buf.put("abcdefghijklmn".getBytes());
		buf.flip();
//		while(buf.hasRemaining()){
//			char c = (char) buf.get();
//			System.out.println(c);
//		}
		
		byte [] bs = buf.array();
		String str = new String(bs,0,buf.limit());
		System.out.println(str);
		
	}
}
