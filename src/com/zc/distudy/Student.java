package com.zc.distudy;

public class Student {
	// 年级
	private String grade;
	// 排名
	private String rank;
	// 年龄
	private Integer age;

	// 重载是根据参数的顺序和类型来实现的，而不是参数的名称
	public Student(Integer age, String grade) {
		this.age = age;
		this.grade = grade;
	}
	//上下2个构造函数，不会因为形参名称的不同而不同
//	public Student(Integer age,String rank) {
//		
//	}

	public Student(String rank, Integer age) {
		this.rank = rank;
		this.age = age;
	}

	public Student(String grade, String rank) {
		this.grade = grade;
		this.rank = rank;
	}
//
//	public String getGrade() {
//		return grade;
//	}
//
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//
//	public String getRank() {
//		return rank;
//	}
//
//	public void setRank(String rank) {
//		this.rank = rank;
//	}

	public void show() {
		System.out.println("执行了student类中的show方法");
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", rank=" + rank + ", age=" + age + "]";
	}

}
