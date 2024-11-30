package com.mahasiswa.model;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {
    private static SessionFactory sessionFactory;
    
    static{
        try{
            sessionFactory = new Configuration().buildSessionFactory();
        } catch (Throwable ex){
            System.err.println("Intial SessionFactory cretion failed" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public static void testConnection(){
        try (Session session = sessionFactory.openSession()){
            System.out.println("Connection to the database was successfull");
        } catch (Exception e){
            System.out.println("failed to the database");
            e.printStackTrace();
        }
    }
}
