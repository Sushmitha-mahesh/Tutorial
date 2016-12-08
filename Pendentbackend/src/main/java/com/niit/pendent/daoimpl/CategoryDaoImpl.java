package com.niit.pendent.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.pendent.dao.CategoryDao;
import com.niit.pendent.model.Category;
@Repository("categoryDao")
@EnableTransactionManagement
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDaoImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveorupdate(Category category)
	{

		System.out.println("yes");
		try {
			System.out.println("yes");
			sessionFactory.getCurrentSession().saveOrUpdate(category);
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
			Category obj=new Category();
			obj.setC_Id(id);
			sessionFactory.getCurrentSession().delete(obj);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
@Transactional
public Category get(String C_Id)
{
	String hql="from Category where C_Id='" +C_Id+ "'";
	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
	 List<Category> l1=(List<Category>)q.list();
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
public List<Category> list()
{
	   List<Category> category = (List<Category>)sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	   return category;
}
@Transactional
public boolean update(Category category) {
	try {
			
			sessionFactory.getCurrentSession().update(category);
			System.out.println(category.getC_Id());
			System.out.println(category.getC_NAME());
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			}

}



}
