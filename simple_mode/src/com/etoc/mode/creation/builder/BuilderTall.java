package com.etoc.mode.creation.builder;

/**
 * 建高楼大厦
 * 
 * @author Administrator
 *
 */
public class BuilderTall implements BuilderHouse {
	public House h = new House();

	@Override
	public void Foundation() {
		h.Foundation = "用混泥土打地基";
		System.out.println("用混泥土打地基");
	}

	@Override
	public void wall() {
		h.wall = "用红砖水泥建墙";
		System.out.println("用红砖水泥建墙");
	}

	@Override
	public void capping() {
		h.capping = "用红吉瓦封顶";
		System.out.println("用红吉瓦封顶");
	}

	@Override
	public House createHouse() {
		// TODO Auto-generated method stub
		return h;
	}

}
