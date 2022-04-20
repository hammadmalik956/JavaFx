package com.example.javafx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeesTest {

    @Test
    void getFeeamount() {
        Fees f1 = new Fees();
        assertEquals( 1000,f1.getFeeamount());
    }



    @Test
    void getFeemonth() {
        Fees f1 = new Fees();
        assertEquals("May",f1.getFeemonth());
    }
