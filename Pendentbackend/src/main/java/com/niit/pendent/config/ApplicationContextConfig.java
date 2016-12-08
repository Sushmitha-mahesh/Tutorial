package com.niit.pendent.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.pendent.dao.BillingDao;
import com.niit.pendent.dao.CartDao;
import com.niit.pendent.dao.CartItemsDao;
import com.niit.pendent.dao.CategoryDao;
import com.niit.pendent.dao.CustomerDao;
import com.niit.pendent.dao.OrdersDao;
import com.niit.pendent.dao.PaymentMethodDao;
import com.niit.pendent.dao.ProductDao;
import com.niit.pendent.dao.RoleDao;
import com.niit.pendent.dao.ShippingDao;
import com.niit.pendent.dao.SupplierDao;
import com.niit.pendent.dao.UserDao;
import com.niit.pendent.daoimpl.BillingDaoImpl;
import com.niit.pendent.daoimpl.CartDaoImpl;
import com.niit.pendent.daoimpl.CartItemsDaoImpl;
import com.niit.pendent.daoimpl.CategoryDaoImpl;
import com.niit.pendent.daoimpl.CustomerDaoImpl;
import com.niit.pendent.daoimpl.OrdersDaoImpl;
import com.niit.pendent.daoimpl.PaymentMethodDaoImpl;
import com.niit.pendent.daoimpl.ProductDaoImpl;
import com.niit.pendent.daoimpl.RoleDaoImpl;
import com.niit.pendent.daoimpl.ShippingDaoImpl;
import com.niit.pendent.daoimpl.SupplierDaoImpl;
import com.niit.pendent.daoimpl.UserDaoImpl;
import com.niit.pendent.model.Billing;
import com.niit.pendent.model.Cart;
import com.niit.pendent.model.CartItems;
import com.niit.pendent.model.Category;
import com.niit.pendent.model.Customer;
import com.niit.pendent.model.Orders;
import com.niit.pendent.model.PaymentMethod;
import com.niit.pendent.model.Product;
import com.niit.pendent.model.Role;
import com.niit.pendent.model.Shipping;
import com.niit.pendent.model.Supplier;
import com.niit.pendent.model.User;

@Configuration
@ComponentScan("com.niit.pendent.*")
@EnableTransactionManagement
public class ApplicationContextConfig {
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/pendent");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");
		
		Properties connectionProperties = new Properties();
		connectionProperties.setProperty("hibernate.connection.pool_size","10");
		connectionProperties.setProperty("hibernate.hbm2ddl.auto","create_update");
		connectionProperties.setProperty("hibernate.show_sql", "true");
		connectionProperties.getProperty("hibernate.dialect","org.hibernate.dialect");
		return dataSource;
		
}


	
	private Properties getHibernateProperties(){
		Properties properties = new Properties();
	    properties.put("hibernate.show_sql","true");
	    properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	    
	    return properties;
	}

	@Autowired 
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Role.class);
		sessionBuilder.addAnnotatedClass(Customer.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(CartItems.class);
		sessionBuilder.addAnnotatedClass(Billing.class);
		sessionBuilder.addAnnotatedClass(Shipping.class);
		sessionBuilder.addAnnotatedClass(Orders.class);
		sessionBuilder.addAnnotatedClass(PaymentMethod.class);
		return sessionBuilder.buildSessionFactory();
		
	}
	  
	@Autowired
	@Bean(name = "transcationManager")
	public HibernateTransactionManager getTranscationManager(SessionFactory sessionFactory){
		HibernateTransactionManager transcationManager = new HibernateTransactionManager(sessionFactory);
		return transcationManager;
	}
	
	@Autowired
	@Bean(name = "userDao")
	public UserDao  user(SessionFactory sessionFactory){
		return new UserDaoImpl (sessionFactory);
	}
	
	@Autowired
	@Bean(name = "productDao")
	public ProductDao product(SessionFactory sessionFactory){
		return new ProductDaoImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name = "categoryDao")
	public CategoryDao  category(SessionFactory sessionFactory){
		return new CategoryDaoImpl (sessionFactory);
	}
	
	@Autowired
	@Bean(name = "supplierDao")
	public SupplierDao  supplier(SessionFactory sessionFactory){
		return new SupplierDaoImpl (sessionFactory);
	}
	@Autowired
	@Bean(name="roleDao")
	public RoleDao role(SessionFactory sessionFactory){
		return new RoleDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="customerDao")
	public CustomerDao customer(SessionFactory sessionFactory){
		return new CustomerDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="cartDao")
	public CartDao cart(SessionFactory sessionFactory){
		return new CartDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="cartItemsDao")
	public CartItemsDao cartitems(SessionFactory sessionFactory){
		return new CartItemsDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="billingDao")
	public BillingDao billing(SessionFactory sessionFactory){
		return new BillingDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="shippingDao")
	public ShippingDao shipping(SessionFactory sessionFactory){
		return new ShippingDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="ordersDao")
	public OrdersDao orders(SessionFactory sessionFactory){
		return new OrdersDaoImpl(sessionFactory);
	}
	@Autowired
	@Bean(name="paymentmethodDao")
	public PaymentMethodDao paymentmethod(SessionFactory sessionFactory){
		return new PaymentMethodDaoImpl(sessionFactory);
	}


}

