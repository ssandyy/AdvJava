package com.hibernateDemo.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class Student {
    @Id
    private int sid;
    private String sname;
    private String sclass;
    @OneToOne
    private Books book;
    @OneToMany

    private List<Books> book2= new ArrayList<Books>();

    public List<Books> getBook2() {
        return book2;
    }

    public void setBook2(List<Books> book2) {
        this.book2 = book2;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }
    public Student() {
        super();
    }
    public Student(int sid, String sname, String sclass) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sclass='" + sclass + '\'' +
                '}';
    }
}
