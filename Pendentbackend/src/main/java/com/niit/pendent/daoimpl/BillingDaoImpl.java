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

import com.niit.pendent.dao.BillingDao;
import com.niit.pendent.model.Billing;
import com.niit.pendent.model.Cart;


@Repository("billingDao")
@EnableTransactionManagement
public class BillingDaoImpl implements BillingDao {
	@Autowired
	private SessionFactory sessionFactory;

	   public BillingDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }

	@Transactional
	public boolean saveorupdate(Billing billing) {
		// TODO Auto-generated method stub
		try{
			 System.out.println("savedd");
			 System.out.println(billing.getB_id());
			 System.out.println(billing.getB_address());
//			 System.out.println(billing.getCustomer_id());
			 sessionFactory.getCurrentSession().saveOrUpdate(billing);
			 return true;
		 }catch (Exception e){
			 e.printStackTrace();
				return false;
		 }
	}

	@Transactional
	public boolean delete(String b_id) {
		// TODO Auto-generated method stub
		try {
			Billing obj=new Billing();
    obj.setB_id(b_id);
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
	public Billing get(String b_id) {
		// TODO Auto-generated method stub
		String hql="from billing where b_id='" +b_id+ "'";
	   	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
	   	 List<Billing> l1=(List<Billing>)q.list();
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
	public List<Billing> list() {
		// TODO Auto-generated method stub
		List<Billing> billing = (List<Billing>)sessionFactory.getCurrentSession().createCriteria(Billing.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return billing;
	}

}
