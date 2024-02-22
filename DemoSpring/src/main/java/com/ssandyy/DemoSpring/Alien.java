package com.ssandyy.DemoSpring;

public class Alien {

	int age;
	private String name;
	private Laptop laptop;
	private Computer comp;

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}


	 public Laptop getLaptop() { return laptop; } public void setLaptop(Laptop
	 laptop) { this.laptop = laptop; }
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name Assigned..");
		this.name = name;
	}

	public Alien() {
		System.out.println("this is alien constructor..!");
	}

	public Alien(int age) {
		super();
		this.age = age;
	}

	public void show() {
		System.out.println("this is alien class from show method..!");
		laptop.compile();
		// comp.compile();
	}

}
