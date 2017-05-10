package com.rpc;

import java.io.Serializable;

public class Resp implements Serializable{
	private int result;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
