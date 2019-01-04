package com.zc.distudy;

public class Student {
	// 年级
	public String grade;
	// 排名
	public String rank;

	// 重载是根据参数的顺序和类型来实现的，而不是参数的名称
	public Student(int a, String grade) {
		this.grade = grade;
	}

	public Student(String rank, int a) {
		this.rank = rank;
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
		return "Student [grade=" + grade + ", rank=" + rank + "]";
	}
	
}
