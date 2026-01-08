package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }


    @Override
    public String toString() {
        return "happy";
    }

    @Override
    public String getMood() {
        return this.toString();
    }
}
