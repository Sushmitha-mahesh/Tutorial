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

import com.niit.pendent.dao.ShippingDao;
import com.niit.pendent.model.Cart;
import com.niit.pendent.model.Shipping;

@Repository("shippingDao")
@EnableTransactionManagement
public class ShippingDaoImpl implements ShippingDao {
	@Autowired
	private SessionFactory sessionFactory;

	   public ShippingDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }

	@Transactional
	public boolean saveorupdate(Shipping shipping) {
		// TODO Auto-generated method stub
		try{
			 System.out.println("savedd");
			 System.out.println(shipping.getS_id());
			 System.out.println(shipping.getS_address());
//			 System.out.println(shipping.getCustomer_id());
			 sessionFactory.getCurrentSession().saveOrUpdate(shipping);
			 return true;
		 }catch (Exception e){
			 e.printStackTrace();
				return false;
		 }
	}

	@Transactional
	public boolean delete(String s_id) {
		// TODO Auto-generated method stub
		try {
			Shipping obj=new Shipping();
    obj.setS_id(s_id);
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
	public Shipping get(String s_id) {
		// TODO Auto-generated method stub
		String hql="from Shipping where s_id='" +s_id+ "'";
	   	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
	   	 List<Shipping> l1=(List<Shipping>)q.list();
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
	public List<Shipping> list() {
		// TODO Auto-generated method stub
		List<Shipping> shipping = (List<Shipping>)sessionFactory.getCurrentSession().createCriteria(Shipping.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return shipping;
	}

}
