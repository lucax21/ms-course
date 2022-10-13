package com.example.demo.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.example.demo.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerid, int days) {
		return new Payment("bob", 200.2, days);
	}
}
