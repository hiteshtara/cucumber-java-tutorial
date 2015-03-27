package com.alexecollins.easybtutorial;

import java.math.BigDecimal;

/**
 * @author alexec (alex.e.c@gmail.com)
 */
//NotThreadSafe
public class Account {
	private BigDecimal balance = BigDecimal.ZERO;

	public void add(BigDecimal amount) {
		if (balance.add(amount).compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("cannot have < 0 balance");
		}
		balance = balance.add(amount);
	}

	public BigDecimal getBalance() {
		return balance;
	}
}
