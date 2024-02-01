package com.hibernateDemo.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
	/* @SuppressWarnings("deprecation") */
	public static void main(String[] args) {

        /*Alien ssandyy = new Alien();
        ssandyy.setAid(104);
        ssandyy.setName("sandeep2");
        ssandyy.setColor("brown");*/

        /*SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ssandyy);
        tx.commit();*/
                        //OR
       /* SessionFactory sf = new Configuration().configure().buildSessionFactory();
       //	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ssandyy);
        tx.commit(); */




        // fetch data from the database
            Alien ssandyydata = new Alien();
            Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class);
            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

            SessionFactory sf = conf.buildSessionFactory(reg);
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            ssandyydata = (Alien) session.get(Alien.class, 103);
            tx.commit();

            System.out.println(ssandyydata);

            
    }
}
