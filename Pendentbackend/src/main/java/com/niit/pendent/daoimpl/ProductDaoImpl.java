package com.niit.pendent.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.pendent.dao.ProductDao;
import com.niit.pendent.model.Category;
import com.niit.pendent.model.Product;

@Repository("productDao")
@EnableTransactionManagement
public class ProductDaoImpl implements ProductDao{
	@Autowired
    private SessionFactory sessionFactory;
	
	
	
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
    public boolean saveorupdate(Product product)
    {
    	
		System.out.println("yes");
		try {
			System.out.println("yes"+product.getP_id());
			
			sessionFactory.getCurrentSession().saveOrUpdate(product);
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
			Product obj=new Product();
			obj.setP_id(id);
			sessionFactory.getCurrentSession().delete(obj);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} 
    }
    
   @Transactional
   public Product get(String p_id)
   {
	   String hql="from Product where p_id='" +p_id+ "'";
	   Query q=sessionFactory.getCurrentSession().createQuery(hql);
	   List<Product> l1=(List<Product>)q.list();
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
   public List<Product> getbycat(String C_Id)
   {
	   String hql="from Product where C_Id='" +C_Id+ "'";
	   Query q=sessionFactory.getCurrentSession().createQuery(hql);
	   List<Product> l1=(List<Product>)q.list();
	   if(l1==null || l1.isEmpty())
	   {
		   return null;
	   }
	   else
	   {
		   return l1;
	   }
   }
   
   
   @Transactional
   public List<Product> list()
   {
	   List<Product> product = (List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	   return product;
   }
  @Transactional
  public boolean update(Product product) {
		try {
				
				sessionFactory.getCurrentSession().update(product);
				System.out.println(product.getP_id());
				System.out.println(product.getP_name());
				System.out.println(product.getP_price());
				System.out.println(product.getP_quantity());
				System.out.println(product.getP_description());
				return true;
				
			} catch (Exception e) {
				e.printStackTrace();
				return false;
				}

	}
}
