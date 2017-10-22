/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.util;

import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author yagoz
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry = null;
    
    private static SessionFactory getSessionFactory() throws HibernateException{
        Configuration configuration = new Configuration();
        configuration.configure();
        Properties properties = configuration.getProperties();
        if(serviceRegistry == null){
            serviceRegistry = new ServiceRegistryBuilder().applySettings(properties).build();
        }
        if(sessionFactory == null){
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        
        return sessionFactory;
    }
    
    public static Session getSession(){
        return getSessionFactory().openSession();
    }
    
}