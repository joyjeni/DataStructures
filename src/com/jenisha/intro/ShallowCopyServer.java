package com.jenisha.intro;

public class ShallowCopyServer {
	
	private int age;
	private int weight;
	
	
	public ShallowCopyServer(int age, int weight) {
		this.age = age;
		this.weight = weight;
	}

	public ShallowCopyServer() {
		age=0;
		weight=0;
	}
	
	

	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public int getWeight() {
		return weight;
	}





	public void setWeight(int weight) {
		this.weight = weight;
	}





	@Override
	public String toString() {
		return "ShallowCopyServer [age:" + age + ", weight:" + weight + "]";
	}
	
	
	
	
	

}
