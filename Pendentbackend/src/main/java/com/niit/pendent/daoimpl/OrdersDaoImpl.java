package com.niit.pendent.daoimpl;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.pendent.dao.OrdersDao;
import com.niit.pendent.model.Orders;

@Repository("ordersDao")
@EnableTransactionManagement
public class OrdersDaoImpl implements OrdersDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	   public OrdersDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }


	   @Transactional
	public boolean saveorupdate(Orders orders) {
		// TODO Auto-generated method stub
		try {
			System.out.println("yes");
			System.out.println(orders.getOrder_id());
			System.out.println(orders.getUser_id());
			System.out.println(orders.getB_address());
			System.out.println(orders.getP_id());
			System.out.println(orders.getTotalprice());
			sessionFactory.getCurrentSession().saveOrUpdate(orders);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}

	   @Transactional
	public boolean delete(String user_id) {
		// TODO Auto-generated method stub
		try {
			Orders obj=new Orders();
    obj.setUser_id(user_id);
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
	public Orders get(String user_id) {
		// TODO Auto-generated method stub
		String hql="from Orders where user_id='" +user_id+ "'";
   	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
   	 List<Orders> l1=(List<Orders>)q.list();
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
	public List<Orders> list() {
		// TODO Auto-generated method stub
		List<Orders> orders = (List<Orders>)sessionFactory.getCurrentSession().createCriteria(Orders.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	 	   return orders;

	}

}
