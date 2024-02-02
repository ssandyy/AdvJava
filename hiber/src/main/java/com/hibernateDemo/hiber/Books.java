package com.hibernateDemo.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
    @Id
    private int bid;
    private String bname;
    private String bauthor;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                '}';
    }
}
