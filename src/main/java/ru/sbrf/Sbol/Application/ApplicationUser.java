package ru.sbrf.Sbol.Application;

import java.util.Scanner;

public class ApplicationUser {
    private String phoneNumber;
    private float amount;
    private String currency;

    Scanner scanner = new Scanner(System.in);

    public void getPhoneNumber() {
        System.out.println("Введите номер телефона.");
        phoneNumber = scanner.next();
    }

    public void getAmount() {
        System.out.println("Введите сумму.");
        amount = scanner.nextFloat();
    }
    public void getCurrency(){
        System.out.println("Введите валюту.");
        String currency = scanner.next();
    }


}
