package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    public Date date;

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }
}
