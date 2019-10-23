package com.etoc.mode.structural.bridge;

/**
 * Bridge:将抽象部分与它的实现分离，并不是说让抽象类与其派生类分离，而是用抽象类和它的派生类用来实现自己的对象
 * 
 * @author Administrator
 *
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		AbsShape redCircle = new Circle(new RedCircle());
		AbsShape greenCircle = new Circle(new GreenCircle());
		redCircle.otherDraw();
		greenCircle.otherDraw();
	}
}
