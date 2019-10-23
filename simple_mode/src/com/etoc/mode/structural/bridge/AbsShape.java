package com.etoc.mode.structural.bridge;

public abstract class AbsShape {
	protected DrawAPI drawAPI;

	protected AbsShape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	// 抽象出来的
	public abstract void otherDraw();
}
