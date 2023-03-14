package com.zemoso.builder;

public class Payslip {
    private final String payslipFormat;
    private final long employeeId;
    private final double basic;
    private final double houseRentAllowance;
    private final double medicalAllowance;
    private final double lunchAllowance;
    private final double employerPf;

    private Payslip(String payslipFormat,long employeeId, double basic, double houseRentAllowance, double medicalAllowance, double lunchAllowance, double employerPf) {
        this.payslipFormat = payslipFormat;
        this.employeeId = employeeId;
        this.basic = basic;
        this.houseRentAllowance = houseRentAllowance;
        this.medicalAllowance = medicalAllowance;
        this.lunchAllowance = lunchAllowance;
        this.employerPf = employerPf;
    }

    public static PayslipBuilder builder(){
        return new PayslipBuilder();
    }

    public static class PayslipBuilder implements PayslipBuilderInterface {
        private String payslipFormat;
        private long employeeId;
        private double basic;
        private double houseRentAllowance;
        private double medicalAllowance;
        private double lunchAllowance;
        private double employerPf;


        @Override
        public PayslipBuilderInterface addPayslipFormat(String payslipFormat) {
            this.payslipFormat=payslipFormat;
            return this;
        }

        @Override
        public PayslipBuilderInterface addEmployeeId(long employeeId) {
            this.employeeId=employeeId;
            return this;
        }

        @Override
        public PayslipBuilderInterface addBasic(long basic) {
            this.basic=basic;
            return this;
        }

        @Override
        public PayslipBuilderInterface addHouseRentAllowance(long houseRentAllowance) {
            this.houseRentAllowance=houseRentAllowance;
            return this;
        }

        @Override
        public PayslipBuilderInterface addMedicalAllowance(long medicalAllowance) {
            this.medicalAllowance=medicalAllowance;
            return this;
        }

        @Override
        public PayslipBuilderInterface addLunchAllowance(long lunchAllowance) {
            this.lunchAllowance=lunchAllowance;
            return this;
        }

        @Override
        public PayslipBuilderInterface addEmployerPf(long employerPf) {
            this.employerPf=employerPf;
            return this;
        }

        @Override
        public Payslip build() {
            return new Payslip(payslipFormat,employeeId,basic,houseRentAllowance,medicalAllowance,lunchAllowance,employerPf);
        }
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "payslipFormat='" + payslipFormat + '\'' +
                ", employeeId=" + employeeId +
                ", basic=" + basic +
                ", houseRentAllowance=" + houseRentAllowance +
                ", medicalAllowance=" + medicalAllowance +
                ", lunchAllowance=" + lunchAllowance +
                ", employerPf=" + employerPf +
                '}';
    }
}
