package com.example.javafx;

import javafx.scene.control.Button;

public class Trainer {

    String name;
    String exp;
    String fees;
    String clients;
    String rating;

    Button Hire;


    Button Consult;

    public Trainer(String name, String exp, String fees, String clients, String rating, Button hire,Button Consult) {
        this.name = name;
        this.exp = exp;
        this.fees = fees;
        this.clients = clients;
        this.rating = rating;
        this.Hire =hire;
        this.Consult = Consult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getClients() {
        return clients;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Button getHire() {
        return Hire;
    }

    public void setHire(Button hire) {
        Hire = hire;
    }

    public Button getConsult() {
        return Consult;
    }

    public void setConsult(Button consult) {
        Consult = consult;
    }



}
