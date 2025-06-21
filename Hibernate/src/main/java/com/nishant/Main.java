package com.nishant;

import java.lang.reflect.Array;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setBrand("MackBook");
        laptop.setModel("m1");
        laptop.setRam(12);
        laptop.setLid(1);

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("MackBook");
        laptop1.setModel("m3");
        laptop1.setRam(16);
        laptop1.setLid(2);

        List<Laptop> list = Arrays.asList(laptop, laptop1);

        Alien alien = new Alien();
        alien.setAnanme("RobinHood_NAme");
        alien.setAid("2");
        alien.setTech("C++");
        alien.setLaptops(list);

        laptop.setAlien(alien);
        laptop1.setAlien(alien);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.nishant.Alien.class);
        configuration.addAnnotatedClass(com.nishant.Laptop.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // we need this only for modificaiton in db
        Transaction transaction = session.beginTransaction();
        session.persist(laptop);
        session.persist(laptop1);
        session.persist(alien);

        transaction.commit();

        session.close();
        ;
        sessionFactory.close();
    }
}