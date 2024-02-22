package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInformation { 

	    @Column(name = "cardholder_name")
	    private String cardholderName;

	    @Column(name = "card_number")
	    private String cardNumber;

	    @Column(name = "expiration_date")
	    private LocalDate expirationDate;

	    @Column(name = "cvv")
	    private String cvv;

	   
	}


