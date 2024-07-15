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
import proyectopizzeria.Bebida;
import proyectopizzeria.persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author agustin
 */
public class BebidaJpaController implements Serializable {

    public BebidaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public BebidaJpaController() {
        emf = Persistence.createEntityManagerFactory("ProyectoPizzeriaPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Bebida bebida) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bebida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Bebida bebida) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bebida = em.merge(bebida);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = bebida.getId();
                if (findBebida(id) == null) {
                    throw new NonexistentEntityException("The bebida with id " + id + " no longer exists.");
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
            Bebida bebida;
            try {
                bebida = em.getReference(Bebida.class, nombre);
                bebida.getNombre();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bebida with id " + nombre + " no longer exists.", enfe);
            }
            em.remove(bebida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Bebida> findBebidaEntities() {
        return findBebidaEntities(true, -1, -1);
    }

    public List<Bebida> findBebidaEntities(int maxResults, int firstResult) {
        return findBebidaEntities(false, maxResults, firstResult);
    }

    private List<Bebida> findBebidaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Bebida.class));
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

    public Bebida findBebida(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Bebida.class, id);
        } finally {
            em.close();
        }
    }

    public int getBebidaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Bebida> rt = cq.from(Bebida.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
