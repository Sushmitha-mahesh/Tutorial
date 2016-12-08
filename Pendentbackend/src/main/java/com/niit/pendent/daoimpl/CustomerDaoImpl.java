package com.niit.pendent.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.pendent.dao.CustomerDao;
import com.niit.pendent.model.Customer;
@Repository("customerDao")
@EnableTransactionManagement
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private SessionFactory sessionFactory;

	   public CustomerDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }

	@Transactional
	public boolean save(Customer customer) {
		// TODO Auto-generated method stub
		try{
			 System.out.println("savedd");
			 System.out.println(customer.getCustomer_id());
			 System.out.println(customer.getCustomer_name());
			 System.out.println(customer.getCustomer_email());
			 System.out.println(customer.getCustomerphone());
//			 System.out.println(customer.getCart_id());
//			 System.out.println(customer.getB_id());
			 System.out.println(customer.getS_id());
			 System.out.println(customer.getUser_id());
			 sessionFactory.getCurrentSession().saveOrUpdate(customer);
			 return true;
		 }catch (Exception e){
			 e.printStackTrace();
				return false;
		 }
	}

	@Transactional
	public boolean delete(String customer_id) {
		// TODO Auto-generated method stub
		try {
			Customer obj=new Customer();
    obj.setCustomer_id(customer_id);
			sessionFactory.getCurrentSession().delete(obj);
			return true;			
			} 
    	catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Customer get(String user_id) {
		// TODO Auto-generated method stub
		String hql="from Customer where user_id='" +user_id+ "'";
	   	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
	   	 List<Customer> l1=(List<Customer>)q.list();
	   	 if(l1==null || l1.isEmpty())
	   	   {
	   		   return null;
	   	   }
	   	   else
	   	   {
	   		   return l1.get(0);
	   	   }

	}

	@Transactional
	public List<Customer> list() {
		// TODO Auto-generated method stub
		List<Customer> customer = (List<Customer>)sessionFactory.getCurrentSession().createCriteria(Customer.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return customer;
	}

	@Transactional
	public boolean update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("yes");
		try{
			System.out.println("yes");
			System.out.println(customer.getCustomer_id());
			System.out.println(customer.getCustomer_name());
			sessionFactory.getCurrentSession().update(customer);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
