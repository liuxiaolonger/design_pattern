package com.etoc.mode.creation.singleton;

public class SingletonLan2 {
	public static void main(String[] args) {
		Singleton1 s = Singleton1.instance();
		Singleton1 ss = Singleton1.instance();
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		System.out.println(s == ss);
	}
}

class Singleton1 {
	private static Singleton1 singleton;

	private Singleton1() {
	};

	public static Singleton1 instance() {
		if (singleton == null) {
			synchronized (Singleton1.class) {
				singleton = new Singleton1();
			}
		}
		return singleton;
	}
}