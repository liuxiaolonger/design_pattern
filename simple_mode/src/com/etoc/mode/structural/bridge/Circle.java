package com.etoc.mode.structural.bridge;

public class Circle extends AbsShape {
	public Circle(DrawAPI drawAPI) {
		super(drawAPI);
	}

	@Override
	public void otherDraw() {
		super.drawAPI.drawCircle();
		System.out.println("画完挂墙上");
	}
}

