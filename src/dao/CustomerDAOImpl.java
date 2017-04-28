package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

import model.CustomerEntity;

public class CustomerDAOImpl implements CustomerDAO {
	
	static EntityManager em;

	public CustomerDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Resort303_COMP303_Final_Project");
		em = emf.createEntityManager();
	}

	@Override
	public void insertCustomer(CustomerEntity customer) {
		try {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(customer);
		em.createNamedQuery("Customer.insertOne")
			    .setParameter("email", customer.getEmail())
			    .setParameter("passphrase",customer.getPassphrase())
			    .setParameter("fullname", customer.getFullname())
			    .executeUpdate();
		//Customer.insertOne(
		//em.flush();
		et.commit(); // automatic rollback on SQL Exception
		} catch(RollbackException re) { // RuntimeException
			re.printStackTrace(System.err); // debug info
		}		

	}

}
