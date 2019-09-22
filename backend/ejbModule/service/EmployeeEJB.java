package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import model.EmployeeEntity;

/**
 * Session Bean implementation class EmployeeEJB
 */
@Stateless
@LocalBean
public class EmployeeEJB {

    @persistanceContex
    private EntityManager em; //"DB controller it manage my database"
    
    public EmployeeEJB() {
        // TODO Auto-generated constructor stub
    }
   public void addNew(EmployeeEntity emoloyeeEntity)
   {
	 System.out.println("=====adding emp to DB====");  
	 em.persist(emoloyeeEntity);    //"save file to the database"
   }
}
