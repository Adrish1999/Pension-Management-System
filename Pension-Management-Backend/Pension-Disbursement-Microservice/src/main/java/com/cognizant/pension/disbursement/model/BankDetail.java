package com.cognizant.pension.disbursement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankDetail {
	private String bankName;
	private String accountNumber;
	private String bankType;
}
