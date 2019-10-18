package com.etoc.mode.creation.singleton;

public class SingletonLan {
	public static void main(String[] args) {
		Singleton s = Singleton.instance();
		Singleton ss = Singleton.instance();
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		System.out.println(s == ss);
	}
}

class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	};

	public static synchronized Singleton instance() {
		return singleton;
	}
}