package com.telusko.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	
    	Alien a = new Alien();
    	
    	a.setAid(106);
    	a.setAname("Rock");
    	a.setColor("Black");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
    	
    	EntityManager em = emf.createEntityManager();
    	
    	Alien getAlien = em.find(Alien.class, 102);
    	
    	System.out.println(getAlien);
    	
    	em.getTransaction().begin();
    	
    	em.persist(a);
    	
    	em.getTransaction().commit();
    	
    	System.out.println(a);
    
    }
}
