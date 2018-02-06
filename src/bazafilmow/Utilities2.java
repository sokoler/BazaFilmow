/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package bazafilmow;

import bazafilmow.model.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
/**
 *
 * @author Mateusz
 */
public class Utilities2 {
    
    
    public static void dodajGatunki(){
        
     EntityManager em = Utils.getEntityManager();
     em.getTransaction().begin();
     
     Gatunek g = new Gatunek();
     Gatunek g1 = new Gatunek();
     Gatunek g2 = new Gatunek();
     
     Gatunek g3 = new Gatunek();
     Gatunek g4 = new Gatunek();
     Gatunek g5 = new Gatunek();
     
     Gatunek g6 = new Gatunek();
     Gatunek g7 = new Gatunek();
     Gatunek g8 = new Gatunek();
     
     
     
     g.setNazwa("Komedia");
     g1.setNazwa("Obyczajowy");
     g2.setNazwa("Film akcji");
     
     g3.setNazwa("Sensacyjny");
     g4.setNazwa("Horror");
     g5.setNazwa("Animowany");
     
     g6.setNazwa("Dramat");
     g7.setNazwa("Thriller");
     g8.setNazwa("Fantasy");
     
     em.persist(g);
     em.persist(g1);
     em.persist(g2);
     
     em.persist(g3);
     em.persist(g4);
     em.persist(g5);
     
     em.persist(g6);
     em.persist(g7);
     em.persist(g8);
    
    
    
      em.getTransaction().commit();

      em.close();  
    }
    
    
    
    public Gatunek dajGatunek(String szukanaNazwa){
    
    List<Gatunek> Gatunki;
    
      EntityManager em = Utils.getEntityManager();
     
      Gatunki=em.createNamedQuery("Gatunek.findByNazwa").setParameter("nazwa", szukanaNazwa).getResultList();
   
    
    
    return Gatunki.get(0);
    }
    
    
}
