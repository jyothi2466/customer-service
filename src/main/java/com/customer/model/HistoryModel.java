package com.customer.model;

import java.util.Date;

public class HistoryModel {
	private String historyGuid;

	private Date purchaseDate;

	public HistoryModel() {
	}

	public String getHistoryGuid() {
		return this.historyGuid;
	}

	public void setHistoryGuid(String historyGuid) {
		this.historyGuid = historyGuid;
	}

	public Date getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}