package com.nishant;

import java.lang.reflect.Array;
import java.util.*;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // Laptop laptop = new Laptop();
        // laptop.setBrand("Dell");
        // laptop.setModel("XCV");
        // laptop.setRam(12);
        // laptop.setLid(4);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.nishant.Laptop.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // we need this only for modificaiton in db
        // Transaction transaction = session.beginTransaction();
        // session.persist(laptop);

        // transaction.commit();
        Laptop L1 = session.get(Laptop.class, 2);
        System.err.println(L1);

        // select * from sql where id = 3 ===sql
        // from laptop where id == 3 >>> hql

        // Query query = session.createQuery("from Laptop");
        // Lisr<Laptops> list = query.getResultList();

        String ram = "16";
        String brand = "macbook";
        // Query query = session.createQuery("from Laptop where brand like ?1 and ram
        // =?2");
        // Lisr<Laptops> list = query.getResultList();
        // query.setParameter(1,brand);
        // query.setParameter(2,ram);

        session.close();
        sessionFactory.close();
    }
}