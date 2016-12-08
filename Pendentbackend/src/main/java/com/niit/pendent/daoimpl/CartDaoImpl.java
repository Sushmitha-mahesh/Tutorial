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

import com.niit.pendent.dao.CartDao;
import com.niit.pendent.model.Cart;

@Repository("cartDao")
@EnableTransactionManagement
public class CartDaoImpl implements CartDao {
	@Autowired
	private SessionFactory sessionFactory;

	   public CartDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }
	   
	 @Transactional
	public boolean saveorupdate(Cart cart) {
		// TODO Auto-generated method stub
		 try{
			 System.out.println("savedd");
			 System.out.println(cart.getCart_id());
			 System.out.println(cart.getGrandtotal());
			 sessionFactory.getCurrentSession().saveOrUpdate(cart);
			 return true;
		 }catch (Exception e){
			 e.printStackTrace();
				return false;
		 }
		
	}

	@Transactional
	public boolean delete(String cart_id) {
		// TODO Auto-generated method stub
		try {
			Cart obj=new Cart();
    obj.setCart_id(cart_id);
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
	public Cart get(String customer_id) {
		// TODO Auto-generated method stub
		String hql="from Cart where customer_id='" +customer_id+ "'";
   	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
   	 List<Cart> l1=(List<Cart>)q.list();
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
	public List<Cart> list() {
		// TODO Auto-generated method stub
		List<Cart> cart = (List<Cart>)sessionFactory.getCurrentSession().createCriteria(Cart.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
      return cart;
	}

}
