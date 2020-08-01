package com.faboda.sms;

import com.faboda.sms.tenant.Tenant;

public class Main {

    public static void main(String[] args) {

        Tenant tenant;
        tenant = new Tenant(8989,0,5000, "Mike Chiloane");
        tenant.printOwingAmount();
    }
}
