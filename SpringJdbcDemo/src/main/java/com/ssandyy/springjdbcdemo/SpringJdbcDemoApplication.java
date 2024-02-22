package com.ssandyy.springjdbcdemo;

import com.ssandyy.springjdbcdemo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

        Alien alien1 = context.getBean(Alien.class);
        alien1.setId(113);
        alien1.setName("sandyy");
        alien1.setTechnology("Java");

        // JDBC steps else use DAO/Repository, so here we are using AlienDao class for @repository annotation
        AlienDao dao = context.getBean(AlienDao.class);
        dao.save(alien1);

        System.out.println(dao.findAll());


    }

}
