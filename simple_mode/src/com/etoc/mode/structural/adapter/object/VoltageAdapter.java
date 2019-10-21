package com.etoc.mode.structural.adapter.object;

/**
 * 介绍：Adapter类：完成220V-5V的转变 通过继承src类，实现 dst 类接口，完成src->dst的适配。 作者：liuxiaolong
 */

public class VoltageAdapter implements Voltage5 {
	/**
	 *     设置电压
	 */
	private Voltage220 voltage220;

	public VoltageAdapter(Voltage220 voltage220) {
		super();
		this.voltage220 = voltage220;
	}

	@Override
	public int output5V() {
		int src = voltage220.output220V();
		System.out.println("适配器工作开始适配电压");
		int dst = src / 44;
		System.out.println("适配完成后输出电压：" + dst);
		return dst;
	}
}
