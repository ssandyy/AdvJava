package com.hibernateDemo.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/* @Table(name = "Alien") */
public class Alien {
	@Id
	private int aid;
    private String name;
    private String color;
    
    
    
	
    public Alien() {
		super();
	}

	public Alien(int aid, String name, String color) {
		super();
		this.aid = aid;
		this.name = name;
		this.color = color;
	}

	

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
