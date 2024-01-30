package com.hibernateDemo.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Alien ssandyy = new Alien();
        ssandyy.setAid(101);
        ssandyy.setName("sandeep");
        ssandyy.setColor("blue");


        /*Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class);
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ssandyy);
        tx.commit();*/


        //SessionFactory sf = new Configuration().configure().buildSessionFactory();
        //System.out.println(sf);
        
        Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ssandyy);
        tx.commit();


    }
}
