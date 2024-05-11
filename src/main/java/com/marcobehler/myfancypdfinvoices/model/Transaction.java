package com.marcobehler.myfancypdfinvoices.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Transaction {
    private String id;
    private BigDecimal amount;
    private Date timestamp;
    private String reference;

    public Transaction(BigDecimal amount, Date timestamp, String reference) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.timestamp = timestamp;
        this.reference = reference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
