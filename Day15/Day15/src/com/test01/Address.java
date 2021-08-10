package com.test01;

public class Address implements Comparable{
	
	private String name;
	private String addr;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		
		Address other_class = (Address)arg0;
		int res = this.getName().compareTo(other_class.getName());
		
		if(res > 0) {
			return -1;
		}else if(res <0) {
			return 1;
		}
		return 0;
	}
	
	
}




