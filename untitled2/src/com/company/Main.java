package com.company;

public class Main {

    public static void main(String[] args) {
        double amount ;
        double remainingAmount ;
        double numberOfOneDollars;
        amount = 11.56;
        remainingAmount = amount * 100;
        numberOfOneDollars = remainingAmount / 100 ;
        remainingAmount = remainingAmount % 100;
        System.out.println(numberOfOneDollars);
        System.out.println(remainingAmount);
    }
}