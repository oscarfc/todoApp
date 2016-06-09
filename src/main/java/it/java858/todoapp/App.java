/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp;

import entity.ToDo;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class App {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        System.out.println("fatto");
        ToDo td = new ToDo();
        td.setTesto("caffè fra poco");
        td.setDataCreazione(new Date());
        
        em.getTransaction().begin();
        em.persist(td);
        em.getTransaction().commit();
    }    
}
