package com.faboda.sms.tenant;

public class Tenant {
    private final int id;
    private float owingAmount;
    private float paidAmount;
    private final String firstName;
    private Status status;

    public Tenant(int id, float paidAmount, float owingAmount, String firstName) {

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

    public float getOwingAmount() {
        return owingAmount;
    }

    public void setOwingAmount(float owingAmount) {
        this.owingAmount = owingAmount;
    }

    public float getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(float paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void printOwingAmount(){
        System.out.println("You owe: ");
    }
}
