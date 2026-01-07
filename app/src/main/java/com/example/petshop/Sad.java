package com.example.petshop;

public class Sad extends Mood {
    @Override
    public String toString() {
        return "sad";
    }

    public String getMood() {
        return this.toString();
    }
}
