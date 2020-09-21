package ru.sbrf.Sbol.Application;

import java.util.Scanner;

public class ApplicationUser {
    private String phoneNumber;
    private float amount;
    private String currency;

    Scanner scanner = new Scanner(System.in);

    public String getPhoneNumber() {
        System.out.println("Введите номер телефона.");
        phoneNumber = scanner.next();
        return phoneNumber;
    }

    public float getAmount() {
        System.out.println("Введите сумму.");
        amount = scanner.nextFloat();
        return amount;
    }

    public String getCurrency() {
        System.out.println("Введите валюту.");
        String currency = scanner.next();
        return currency;
    }
}
