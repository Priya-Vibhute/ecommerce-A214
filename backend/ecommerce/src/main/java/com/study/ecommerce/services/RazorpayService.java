package com.study.ecommerce.services;

import com.study.ecommerce.dtos.OrderResponse;
import com.study.ecommerce.dtos.VerificationRequest;

public interface RazorpayService {
	
  OrderResponse	createOrder();
  
  boolean verifyPayment(VerificationRequest verificationRequest);
  

}
