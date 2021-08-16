package com.test04;

import java.io.Serializable;

public class My_profile implements Serializable{
	private transient String name;
	private static String addr;

	
	
	public My_profile(String name, String addr) {
		super();
		this.name =name;
		this.addr =addr;
	}



	@Override
	public String toString() {
		return "My_profile [name=" + name + ", addr=" + addr + "]";
	}
	
}
