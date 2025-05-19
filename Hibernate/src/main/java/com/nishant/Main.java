package com.nishant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

//        student.setRollNo("6");
//        student.setsName("Rohit");
//        student.setsAge(22);

        Student student2 = null;


        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.nishant.Student.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory() ;
        Session session = sessionFactory.openSession();

        // we need this only for modificaiton in db
        Transaction transaction = session.beginTransaction();
//        session.persist(student);
//        session.merge(student);

        student = session.get(Student.class,"6");
        session.remove(student);

        transaction.commit();

       student2 = session.get(Student.class,"1");
        System.out.println(student2);

        session.close();;
        sessionFactory.close();
    }
}