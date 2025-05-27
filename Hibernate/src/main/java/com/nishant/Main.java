package com.nishant;

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

        Alien alien = new Alien();
        alien.setAnanme("RobinHood_NAme");
        alien.setAid("2");
        alien.setTech("C++");
        alien.setLaptop(laptop);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.nishant.Alien.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // we need this only for modificaiton in db
        Transaction transaction = session.beginTransaction();
        session.persist(alien);

        transaction.commit();

        session.close();
        ;
        sessionFactory.close();
    }
}