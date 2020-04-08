import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;

class TestCoHibernate {
    @Test
    void sessionOk() {
        EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory("derby-persistence-unit");
       // EntityManager entityManager = sessionFactory.createEntityManager();
       // assertTrue(entityManager.isOpen());
      //  entityManager.close();
        //sessionFactory.close();
    }
}