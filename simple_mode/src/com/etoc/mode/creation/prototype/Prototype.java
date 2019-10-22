package com.etoc.mode.creation.prototype;
/**
 * --实现Cloneable 
 * @author Administrator
 *
 */
public class Prototype {
	static class Student implements Cloneable {// 这里为了简单，直接public，实际中不推荐
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
		}

		public int id = 12345;
		public String name = "小明";
		public Address address = new Address();

		@Override
		public Student clone() throws CloneNotSupportedException {
			Student clone = (Student) super.clone();
			clone.address = address.clone();
			return clone;
		}
	}

	static class Address implements Cloneable {
		public String name = "西湖";
		@Override
		public Address clone() throws CloneNotSupportedException {
			return (Address) super.clone();
		}
	}

	public static void main(String[] args) throws Exception {
		Student student = new Student();
		Student clone = student.clone();
		System.out.println("student::::==========>"+student);
		System.out.println("clone::::==========>"+clone);
	}
}
