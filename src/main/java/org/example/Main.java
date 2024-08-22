package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        student student = new student();
        FullName fullName = new FullName("lakmal", "kumarasiri");
        student.setId(4);
        student.setName(fullName);
        student.setAddress("gampaha");


        Transaction transaction = session.beginTransaction();

       // session.save(student);
       // session.update(student);
       // session.delete(student);
        student student1 = session.get(student.class,1);
        if (student1!=null){
            System.out.println(student.getId());
            System.out.println(student.getAddress());
            System.out.println(student.getName().getFirstName());
            System.out.println(student.getName().getLastName());
        }
        transaction.commit();
        session.close();

    }
}