package com.hibernateDemo.hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "alien_test")
public class Alien {
	@Id
    @Column(name ="aidtest")
	private int aid;



    @Column(name = "anametest")
    private String name;
    private AlienName alienName;
    @Column(name = "asaltest")
    private String color;
    
    
    
	
    public Alien() {
		super();
	}

	public Alien(int aid,AlienName alienName, String name, String color) {
		super();
		this.aid = aid;
		this.name = name;
		this.color = color;
        this.alienName = alienName;
	}


    public AlienName getAlienName() {
        return alienName;
    }

    public void setAlienName(AlienName alienName) {
        this.alienName = alienName;
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
                ", alienName=" + alienName +
                ", color='" + color + '\'' +
                '}';
    }
}
