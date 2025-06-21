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

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("MackBook Pro");
        laptop2.setModel("m1");
        laptop2.setRam(32);
        laptop2.setLid(3);

        Alien alien = new Alien();
        alien.setAnanme("RobinHood_NAme");
        alien.setAid("2");
        alien.setTech("C++");

        Alien alien1 = new Alien();
        alien1.setAnanme("Pirates_Grill");
        alien1.setAid("3");
        alien1.setTech("Backend");

        alien.setLaptops(Arrays.asList(laptop, laptop1));
        alien1.setLaptops(Arrays.asList(laptop2));

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
        session.persist(laptop2);

        session.persist(alien);
        session.persist(alien1);

        transaction.commit();

        Session session2 = sessionFactory.openSession();
        Alien a5 = session2.get(Alien.class, 2);
        // System.out.println(a5);

        session2.close();
        session.close();
        sessionFactory.close();
    }
}