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

        // ------------------------------------------Mapping Data ------------------------------------------------------
        Books book = new Books();
        book.setBid(5);
        book.setBname("English");
        book.setBauthor("Shivy");

        Student student = new Student();
        student.setSid(3);
        student.setSname("dilip");
        student.setSclass("twelve");
        student.setBook(book);
        student.getBook2().add(book);


        /*Configuration congiguration = new Configuration().addAnnotatedClass(Books.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(congiguration.getProperties()).build();
        SessionFactory sf = congiguration. buildSessionFactory(registry);
        Session session = sf.openSession();

        session.beginTransaction();
        session.save(student);
        session.save(book);
        session.getTransaction().commit();*/


        Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Books.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        session.save(book);
        tx.commit();


//======================================   xxxxxx ========================

      /*AlienName an = new AlienName();
        an.setFname("Sandeep2");
        an.setMname("kumar");
        an.setLname("Yadav");*/


        /*Alien ssandyy = new Alien();
        ssandyy.setAid(104);
        ssandyy.setName("testing");
        ssandyy.setAlienName(an);
        ssandyy.setColor("brown");*/

// ===================  Create and save data =================
       /* Alien ssandyy = new Alien();
        ssandyy.setAid(100);
        ssandyy.setName("testing");
        ssandyy.setAlienName(an);
        ssandyy.setColor("brown");
        Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ssandyy);
        tx.commit();*/

                        //OR
       /*SessionFactory sf = new Configuration().configure().buildSessionFactory();
       //	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ssandyy);
        tx.commit();*/

//===========================================================================================


//===================      fetch data from the database      ==============================
        /*
            Alien ssandyydata = new Alien();

            Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class);
            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
            SessionFactory sf = conf.buildSessionFactory(reg);
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            ssandyydata = (Alien) session.get(Alien.class, 103);
            tx.commit();

            System.out.println(ssandyydata);
*/


        
         
    }
}
