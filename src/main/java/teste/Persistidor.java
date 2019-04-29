package teste;

import entities.Aluno;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.xml.bind.JAXBException;

public class Persistidor {
    public static void main(String[] args) throws JAXBException {
        Aluno aluno1 = new Aluno("Maria", "taynaragarces@gmail.com", "98984018000");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();


        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(aluno1);
        tx.commit();

        em.close();
        emf.close();
    }
}


