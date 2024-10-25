/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.logging.Level;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class PersistenceManager {
    
    private static final boolean DEBUG=true;
    private static final PersistenceManager singleton = new PersistenceManager();
    protected EntityManagerFactory enf;
    
    public static PersistenceManager getInstance(){
        return singleton;
    }

    private PersistenceManager() {
    }
    
    public EntityManagerFactory getEntityManagerFactory(){
        if(enf==null){
            createEntityManagerFactory();
        }
        return enf;
    }
    
    private void createEntityManagerFactory(){
        this.enf=Persistence.createEntityManagerFactory("CompetitorsPU",System.getProperties());
        if(DEBUG){
            System.out.println("persistencia iniciada en: "+new java.util.Date());
        }
    }
    
    public void closeEntityManagerFactory(){
        if(enf!=null){
            enf.close();
            enf=null;
            if(DEBUG){
            System.out.println("persistencia finalizada en: "+new java.util.Date());
            }
        }
    }
}
