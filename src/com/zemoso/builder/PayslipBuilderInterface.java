package com.zemoso.builder;

public interface PayslipBuilderInterface {
    PayslipBuilderInterface addPayslipFormat(String payslipFormat);
    PayslipBuilderInterface addEmployeeId(long employeeId);
    PayslipBuilderInterface addBasic(long basic);
    PayslipBuilderInterface addHouseRentAllowance(long houseRentAllowance);
    PayslipBuilderInterface addMedicalAllowance(long medicalAllowance);
    PayslipBuilderInterface addLunchAllowance(long lunchAllowance);
    PayslipBuilderInterface addEmployerPf(long employerPf);
    Payslip build();
}
