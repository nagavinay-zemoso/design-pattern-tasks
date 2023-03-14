package com.zemoso.builder;

public class Main {
    public static void main(String[] args) {
        Hr hr=new Hr();

        hr.makeElectronicPayslip();
        Payslip electronicPayslip=hr.getPayslip();
        System.out.println(electronicPayslip.toString());
    }
}
