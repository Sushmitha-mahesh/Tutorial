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

import com.niit.pendent.dao.UserDao;
import com.niit.pendent.model.User;

@Repository("userDao")
@EnableTransactionManagement
public class UserDaoImpl implements UserDao {
	 @Autowired
	   private SessionFactory sessionFactory;

	   public UserDaoImpl(SessionFactory sessionfactory)
	   {
		   this.sessionFactory = sessionfactory;
	   }
	  
	    @Transactional
	    public boolean saveorupdate(User user)
	    {
	    	try {
				System.out.println("yes");
				System.out.println(user.getUser_fname());
				System.out.println(user.getUser_id());
				System.out.println(user.getEmail());
				System.out.println(user.getPassword());
				System.out.println(user.getUser_lname());
				System.out.println(user.getPassword());
			
				System.out.println(user.getMobile_number());
				sessionFactory.getCurrentSession().saveOrUpdate(user);
				return true;
			} catch (Exception e) {
				
				e.printStackTrace();
				return false;
			}
	    }
	    
	    @Transactional
	    public boolean delete(String user_id)
	    {
	    	try {
				User obj=new User();
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
		public User get(String user_id) {
			// TODO Auto-generated method stub
			String hql="from User where user_id='" +user_id+ "'";
	    	 Query q=sessionFactory.getCurrentSession().createQuery(hql);
	    	 List<User> l1=(List<User>)q.list();
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
		public List<User> list() {
			// TODO Auto-generated method stub
			List<User> user = (List<User>)sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		 	   return user;
		}

		public User isvalidate(String email_id, String password) {
			// TODO Auto-generated method stub
			String hql="from UserDetails where email_id='" +email_id + "' and password='" +password+ "'";
	    	Query q=sessionFactory.getCurrentSession().createQuery(hql);
	    	 List<User> l1=(List<User>)q.list();
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
		public User getByEmail(String email) {
			// TODO Auto-generated method stub
			try {
				System.out.println("my email is "+email);
				String hql="from User where email='" +email+ "'";
				Query q=sessionFactory.getCurrentSession().createQuery(hql);
				List<User> l1=(List<User>)q.list();
				{
					if(l1==null || l1.isEmpty())
					{
						System.out.println("I am not gating data");
						return null;
					}
					else
					{
						System.out.println("I got data");
						return l1.get(0);
					}
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	    
	    
}
