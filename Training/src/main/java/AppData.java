

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.JpaDemo.Trainingdemo;


public class AppData
{
    public static void main( String[] args )
    {
      Trainingdemo a = new Trainingdemo();
      a.setTid(4);
      a.setTname("FullStack");
      a.setSeats("40");
      
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    	
    }
}
