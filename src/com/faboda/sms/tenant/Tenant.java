package com.faboda.sms.tenant;

import com.faboda.sms.Status;

public class Tenant {
    private final int id;
    private int owingAmount;
    private int paidAmount;
    private final String firstName;
    private Status status;

    public Tenant(int id, int paidAmount, int owingAmount, String firstName) {

        this.id = id;
        this.paidAmount = paidAmount;
        this.owingAmount = owingAmount;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getOwingAmount() {
        return owingAmount;
    }

    public void setOwingAmount(int owingAmount) {
        this.owingAmount = owingAmount;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }
}
