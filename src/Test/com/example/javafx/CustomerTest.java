package com.example.javafx;

import com.example.javafx.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
   public void checkFname() {
        Customer c1 = new Customer();
        assertEquals( "hammad",c1.getFname());
    }

    @Test
    public void checkLname() {
        Customer c1 = new Customer();
        assertEquals( "Malik",c1.getLname());
    }

    @Test
    public void checkEmail() {
        Customer c1 = new Customer();
        assertEquals( "hammadhameed956@gmail.com",c1.getEmail());
    }

    @Test
    public void checkPass() {
        Customer c1 = new Customer();
        assertEquals( "Hammad123",c1.getPassword());
    }

}