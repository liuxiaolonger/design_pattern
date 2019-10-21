package com.etoc.mode.structural.adapter.object;

public class Client {
	public static void main(String[] args) {
		System.out.println("===============ÀàÊÊÅäÆ÷==============");
		Mobile mobile = new Mobile();
		mobile.charging(new VoltageAdapter(new Voltage220()));
	}
}
