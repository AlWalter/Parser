package com.company;

public class Main {

    public static void main(String[] args) {
        Countries countries = new Countries();
        countries.addCountry("One", "OJOJ");
        countries.addCountry("TWO", "JJJ");
        System.out.println(countries.report());
    }
}
