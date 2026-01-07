package com.example.petshop;

public class Happy extends Mood {
    @Override
    public String toString() {
        return "happy";
    }
    public String getMood() {
        return this.toString();
    }
}
