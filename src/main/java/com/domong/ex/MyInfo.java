package com.domong.ex;

import java.util.ArrayList;

public class MyInfo {
	
	//멤버변수 먼저 정의
	private String name;
	private double weight;
	private double height;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalculator;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public void bmiCalculation() {
		bmiCalculator.bmicalculation(weight,height);
	}
	
	public void getInfoPrint() {
		System.out.println("이름 :"+ name);
		System.out.println("키 :"+ height);
		System.out.println("몸무게 :"+ weight);
		System.out.println("취미 :"+ hobbys);
		bmiCalculation();
	}

}
