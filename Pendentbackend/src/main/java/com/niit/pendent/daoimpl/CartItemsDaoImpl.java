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

import com.niit.pendent.dao.CartItemsDao;
import com.niit.pendent.model.Cart;
import com.niit.pendent.model.CartItems;
@Repository("cartItemsDao")
@EnableTransactionManagement
public class CartItemsDaoImpl implements CartItemsDao {
	@Autowired
	private SessionFactory sessionFactory;

	   public CartItemsDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }

	@Transactional
	public boolean saveorupdate(CartItems cartitems) {
		// TODO Auto-generated method stub
		try{
			 System.out.println("saved");
			 System.out.println(cartitems.getCartitems_id());
			 System.out.println(cartitems.getQuantity());
			 System.out.println(cartitems.getTotalprice());
			 System.out.println(cartitems.getP_id());
//			 System.out.println(cartitems.getCart_id());
			 sessionFactory.getCurrentSession().saveOrUpdate(cartitems);
			 return true;
		 }catch (Exception e){
			 e.printStackTrace();
				return false;
		 }
		

	}

	@Transactional
	public boolean delete(String cartitems_id) {
		// TODO Auto-generated method stub
		try {
			CartItems obj=new CartItems();
    obj.setCartitems_id(cartitems_id);
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
	public CartItems get(String cartitems_id) {
		// TODO Auto-generated method stub
		String hql="from Cartitems where cartitems_id='" +cartitems_id+ "'";
	   	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
	   	 List<CartItems> l1=(List<CartItems>)q.list();
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
	public List<CartItems> list() {
		// TODO Auto-generated method stub
		List<CartItems> cartitems = (List<CartItems>)sessionFactory.getCurrentSession().createCriteria(CartItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return cartitems;
	}
	

}
