package com.etoc.mode.creation.builder;

/**
 * 建普通大楼
 * 
 * @author Administrator
 *
 */
public class BuilderVilla implements BuilderHouse {
	public House h = new House();

	@Override
	public void Foundation() {
		h.Foundation = "打桩,整版基础";
		System.out.println("打桩,整版基础");
	}

	@Override
	public void wall() {
		h.wall = "用泡沫砖建墙";
		System.out.println("用泡沫砖建墙");
	}

	@Override
	public void capping() {
		h.capping = "现浇封顶";
		System.out.println("现浇封顶");
	}

	@Override
	public House createHouse() {
		// TODO Auto-generated method stub
		return h;
	}

}
