package com.zemoso.builder;

public class Hr {

    private final Payslip.PayslipBuilder payslipBuilder=Payslip.builder();

    public void makeElectronicPayslip(){
        this.payslipBuilder.addPayslipFormat("Electronic")
                .addEmployeeId(1)
                .addBasic(20000)
                .addHouseRentAllowance(8000)
                .addMedicalAllowance(1250)
                .addLunchAllowance(2000)
                .addEmployerPf(1800);
    }
    public Payslip getPayslip(){
        return this.payslipBuilder.build();
    }
}
