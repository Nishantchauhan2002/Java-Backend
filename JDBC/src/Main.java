package com.nishant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
       Student student = new Student();
       System.out.println(student);

        Configuration configuration = new Configuration();

        SessionFactory sessionFactory = configuration.buildSessionFactory() ;
        Session session = sessionFactory.openSession();

        session.save(student);
    }
}