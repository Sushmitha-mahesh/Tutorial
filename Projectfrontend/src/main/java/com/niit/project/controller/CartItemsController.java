package com.niit.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niit.pendent.dao.CartItemsDao;
import com.niit.pendent.model.CartItems;

@Controller
public class CartItemsController {
   @Autowired
   CartItemsDao cartItemsDao;
     
   @Autowired
   CartItems cartItems;
}

