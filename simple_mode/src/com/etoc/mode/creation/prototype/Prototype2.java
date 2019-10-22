package com.etoc.mode.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * --原型深拷贝(序列化,反序列化)
 * @author Administrator
 *
 */
public class Prototype2 {
	static class Student implements Serializable {// 这里为了简单，直接public，实际中不推荐
		private static final long serialVersionUID = 6977402643848374753L;
		// 因为实际应用中类是会改动的，UID用来判断类版本，默认为1L;
		public int id = 12345;
		public String name = "小明";
		public Address address = new Address();

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
	}

	static class Address implements Serializable {
		@Override
		public String toString() {
			return "Address [name=" + name + "]";
		}

		public String name = "西湖";
	}

	public static <T extends Serializable> T clone(T obj) throws Exception {
		T cloneObj;
		// 写入字节流
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream obs = new ObjectOutputStream(out);
		obs.writeObject(obj);
		obs.close();
		// 分配内存，写入原始对象，生成新对象
		ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(ios);
		// 返回生成的新对象
		cloneObj = (T) ois.readObject();
		ois.close();
		return cloneObj;
	}

	public static void main(String[] args) throws Exception {
		Student student = new Student();
		Student clone = clone(student);
		System.out.println(clone);
	}
}
