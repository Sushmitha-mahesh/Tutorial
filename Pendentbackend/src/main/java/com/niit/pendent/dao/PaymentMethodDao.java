package com.niit.pendent.dao;

import com.niit.pendent.model.PaymentMethod;

public interface PaymentMethodDao {
	public boolean saveorupdate(PaymentMethod paymentmethod);
	public PaymentMethod get(String PaymentMethod);
}
