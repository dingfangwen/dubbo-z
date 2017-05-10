package com.zebra.domain;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Engin2Info {
	private String ip;
	private int port;
	private BlockingQueue<byte []>dataQueue = new LinkedBlockingQueue<byte[]>();
	
	
	public BlockingQueue<byte[]> getDataQueue() {
		return dataQueue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + port;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engin2Info other = (Engin2Info) obj;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (port != other.port)
			return false;
		return true;
	}

	
	public Engin2Info() {
	}
	public Engin2Info(String ip,int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
