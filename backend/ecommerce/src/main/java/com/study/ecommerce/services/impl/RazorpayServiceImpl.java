package com.study.ecommerce.services.impl;

import org.springframework.beans.factory.annotation.Value;

import com.study.ecommerce.dtos.OrderResponse;
import com.study.ecommerce.dtos.VerificationRequest;
import com.study.ecommerce.services.RazorpayService;

public class RazorpayServiceImpl implements RazorpayService{
	
	@Value("${razorpay.key}")
	private String razorpayKey;
	
	
	@Value("${razorpay.secret}")
	private String razorpaySecret;

	@Override
	public OrderResponse createOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyPayment(VerificationRequest verificationRequest) {
		// TODO Auto-generated method stub
		return false;
	}

}
