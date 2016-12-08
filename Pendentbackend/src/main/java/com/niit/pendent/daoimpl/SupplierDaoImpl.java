package com.niit.pendent.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.pendent.dao.SupplierDao;
import com.niit.pendent.model.Category;
import com.niit.pendent.model.Supplier;

@Repository("supplierDao")
@EnableTransactionManagement
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveorupdate(Supplier supplier)
	{
		System.out.println("yes");
		try {
			System.out.println("yes");
			System.out.println(supplier.getS_id());
			System.out.println(supplier.getS_name());
			System.out.println(supplier.getS_address());
			System.out.println(supplier.getS_description());
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}	
	}

	@Transactional
	public boolean delete(String id)
	{
		try {
			Supplier obj=new Supplier();
			obj.setS_id(id);
			sessionFactory.getCurrentSession().delete(obj);
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}

	@Transactional
	public Supplier get(String s_id)
	{
		   String hql="from Supplier where s_id='" +s_id+ "'";
		   Query q=sessionFactory.getCurrentSession().createQuery(hql);
		   List<Supplier> l1=(List<Supplier>)q.list();
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
	public List<Supplier> list()
	{
		   List<Supplier> supplier = (List<Supplier>)sessionFactory.getCurrentSession().createCriteria(Supplier.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		   return supplier;
	}
 @Transactional
 public boolean update(Supplier supplier) {
		try {
				
				sessionFactory.getCurrentSession().update(supplier);
				System.out.println(supplier.getS_id());
				System.out.println(supplier.getS_name());
				System.out.println(supplier.getS_description());
				System.out.println(supplier.getS_address());
				return true;
				
			} catch (Exception e) {
				e.printStackTrace();
				return false;
				}

	}



}
