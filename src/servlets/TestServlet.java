package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
 * Created by aaron on 4/4/17.
 */
@javax.servlet.annotation.WebServlet(name = "servlets.TestServlet", urlPatterns = "root")
public class TestServlet extends javax.servlet.http.HttpServlet {

	protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

	}

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//		EntityManagerFactory _emf = Persistence.createEntityManagerFactory("Resort303_COMP303_Final_Project");
//		EntityManager _em = _emf.createEntityManager();
//		List<CustomerEntity> a=  _em.createQuery("select c from CustomerEntity c", CustomerEntity.class).getResultList();
//
//		System.out.println("*****************");
//		System.out.println(a);
//		System.out.println("*****************");
//
//		for (CustomerEntity c : a){
//			System.out.println(c.getFullname());
//		}
//
		System.out.println("TEST");
	}
}
