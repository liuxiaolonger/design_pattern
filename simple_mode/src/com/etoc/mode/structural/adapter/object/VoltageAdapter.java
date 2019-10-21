package com.etoc.mode.structural.adapter.object;

/**
 * ���ܣ�Adapter�ࣺ���220V-5V��ת�� ͨ���̳�src�࣬ʵ�� dst ��ӿڣ����src->dst�����䡣 ���ߣ�liuxiaolong
 */

public class VoltageAdapter implements Voltage5 {
	/**
	 *     ���õ�ѹ
	 */
	private Voltage220 voltage220;

	public VoltageAdapter(Voltage220 voltage220) {
		super();
		this.voltage220 = voltage220;
	}

	@Override
	public int output5V() {
		int src = voltage220.output220V();
		System.out.println("������������ʼ�����ѹ");
		int dst = src / 44;
		System.out.println("������ɺ������ѹ��" + dst);
		return dst;
	}
}
