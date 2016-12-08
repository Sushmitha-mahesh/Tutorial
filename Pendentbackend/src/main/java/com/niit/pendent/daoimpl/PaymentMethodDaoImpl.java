package com.niit.pendent.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.pendent.dao.PaymentMethodDao;
import com.niit.pendent.model.Cart;
import com.niit.pendent.model.PaymentMethod;


@Repository("paymentmethodDao")
@EnableTransactionManagement
public class PaymentMethodDaoImpl implements PaymentMethodDao {
	@Autowired
	private SessionFactory sessionFactory;

	   public PaymentMethodDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }
	   


	@Transactional
	public boolean saveorupdate(PaymentMethod paymentmethod) {
		// TODO Auto-generated method stub
		try{
			 System.out.println("savedd");
			 System.out.println(paymentmethod.getPaymentMethod());
			 sessionFactory.getCurrentSession().saveOrUpdate(paymentmethod);
			 return true;
		 }catch (Exception e){
			 e.printStackTrace();
				return false;
		 }
	}


	@Transactional
	public PaymentMethod get(String PaymentMethod) {
		// TODO Auto-generated method stub
		List<PaymentMethod> paymentmethod = (List<PaymentMethod>)sessionFactory.getCurrentSession().createCriteria(PaymentMethod.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	      return  (com.niit.pendent.model.PaymentMethod) paymentmethod;
		
	}

}
