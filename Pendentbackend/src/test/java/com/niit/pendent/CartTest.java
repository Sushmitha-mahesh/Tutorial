package com.niit.pendent;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.pendent.dao.CartDao;
import com.niit.pendent.dao.CartItemsDao;
import com.niit.pendent.dao.CustomerDao;
import com.niit.pendent.dao.ProductDao;
//import com.niit.pendent.dao.UserDao;
import com.niit.pendent.model.Cart;
import com.niit.pendent.model.CartItems;
import com.niit.pendent.model.Customer;
import com.niit.pendent.model.Product;
//import com.niit.pendent.model.User;




public class CartTest {
	public static void main(String a[])
	  {
		  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		  context.scan("com.niit.*");
		  context.refresh();
		  
		  CartDao cartDao = (CartDao) context.getBean("cartDao");
		  Cart  cart= (Cart) context.getBean("cart");
		  CartItemsDao cartItemsDao = (CartItemsDao) context.getBean("cartItemsDao");
		  CartItems  cartitems= (CartItems) context.getBean("cartItems");
		  ProductDao productDao = (ProductDao) context.getBean("productDao");
		  Product  product= (Product) context.getBean("product");
		  CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
		  Customer  customer= (Customer) context.getBean("customer");



		  System.out.println(1);
		  
		  Cart c=(Cart)cartDao.get("customerC286E0");
	      if(c==null)
	      {
	    	  System.out.println("cart is not there");
	      }
	      else
	      {
	    	  Product p= (Product)productDao.get("product64368E");
              cartitems.setP_id(p.getP_id());
			   cartitems.setQuantity(4);
			   cartitems.setCart(c);
			   cartitems.setCustomer_id("customerC286E0");
			   cartitems.setTotalprice(cartitems.getQuantity()*p.getP_price());
			   if(cartItemsDao.saveorupdate(cartitems)==true)
				{
				   double gr,gt;
				   String gt1;
				   String g=c.getGrandtotal();
					double t= cartitems.getTotalprice();
					if(g==null)
					{
					  gr=0;
					  gt=gr+t;
					  gt1= String.valueOf(gt);
					}
					else
					{
						gr=Double.parseDouble(g);
						gt=gr+t;
					    gt1= String.valueOf(gt);
					}
					System.out.println(t+" "+g+" "+gt);

					 c.setGrandtotal(gt1);
					 if(cartDao.saveorupdate(c)==true)
					 {
						 System.out.println("done");
					 }
					
					
				}
		      	 
	      }
	      /*List<CartItems> list=(List<CartItems>)cartItemsDao.get("cartE09C1C");// i  passed existing cartid
			for(CartItems list1: list)
			{
				System.out.println(list1.getCartitems_id());
			System.out.println(list1.getP_id());
			//System.out.println(list1.getUserId());
				System.out.println(list1.getQunatity());
				System.out.println(list1.getTotalprice());
			}*/
		   }

}
	  
