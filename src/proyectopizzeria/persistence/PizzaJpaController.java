package proyectopizzeria.persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import proyectopizzeria.Pizza;
import proyectopizzeria.persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author agustin
 */
public class PizzaJpaController implements Serializable {

    public PizzaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public PizzaJpaController() { 
        emf = Persistence.createEntityManagerFactory("ProyectoPizzeriaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pizza pizza) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pizza);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pizza pizza) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pizza = em.merge(pizza);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pizza.getId();
                if (findPizza(id) == null) {
                    throw new NonexistentEntityException("The pizza with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String nombre) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pizza pizza;
            try {
                pizza = em.getReference(Pizza.class, nombre);
                pizza.getNombre();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pizza with id " + nombre + " no longer exists.", enfe);
            }
            em.remove(pizza);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pizza> findPizzaEntities() {
        return findPizzaEntities(true, -1, -1);
    }

    public List<Pizza> findPizzaEntities(int maxResults, int firstResult) {
        return findPizzaEntities(false, maxResults, firstResult);
    }

    private List<Pizza> findPizzaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pizza.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Pizza findPizza(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pizza.class, id);
        } finally {
            em.close();
        }
    }

    public int getPizzaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pizza> rt = cq.from(Pizza.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
