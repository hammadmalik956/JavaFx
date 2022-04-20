package com.example.javafx;

public class Fees {
    private String feemonth;
    private int feeamount;

    public Fees(String feemonth, int feeamount) {
        this.feemonth = feemonth;
        this.feeamount = feeamount;
    }
    public Fees() {
        this.feemonth = " ";
        this.feeamount = 0;
    }
    public int getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(int feeamount) {
        this.feeamount = feeamount;
    }



    public String getFeemonth() {
        return feemonth;
    }

    public void setFeemonth(String feemonth) {
        this.feemonth = feemonth;
    }



}
