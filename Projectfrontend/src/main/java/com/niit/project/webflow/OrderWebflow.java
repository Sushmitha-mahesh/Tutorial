/*package com.niit.project.webflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.niit.pendent.model.Orders;
import com.niit.pendent.model.Shipping;

@Component
public class OrderWebflow {
	

	@Autowired
	Orders orders;
	
	@Autowired
	Shipping shipping;
	
	public Orders initFlow()
	{
		orders= new Orders();
		return orders;
	}
	
	public String addShippingAddress(Orders orders, String shipping)
	{
		orders.setS_address(shipping);
		return "success";
	}
}
*/