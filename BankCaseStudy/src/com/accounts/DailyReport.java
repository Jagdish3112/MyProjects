package com.accounts;

import java.time.LocalDateTime;

public class DailyReport {
	    private int accno;
	    private String holderName;
	    private LocalDateTime time;
	    private String transactionType;

	    public DailyReport(int accno, String holderName, LocalDateTime time, String transactionType) {
	        this.accno = accno;
	        this.holderName = holderName;
	        this.time = time;
	        this.transactionType = transactionType;
	    }

	    public int getAccno() {
	        return accno;
	    }

	    public String getHolderName() {
	        return holderName;
	    }

	    public LocalDateTime getTime() {
	        return time;
	    }

	    public String getTransactionType() {
	        return transactionType;
	    }
}
