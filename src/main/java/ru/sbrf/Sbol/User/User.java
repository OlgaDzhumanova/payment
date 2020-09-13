package ru.sbrf.Sbol.User;

import java.util.Scanner;

public class User {
    private String accountNumber;
    private String userNumber;

    Scanner scanner = new Scanner(System.in);

    public String getAccountNumber(){
        System.out.println("Укажите номер счета.");
        accountNumber = scanner.next();
        return accountNumber;
    }
    public String getUserNumber(){
        System.out.println("Введите свой номер пользователя.");
        userNumber = scanner.next();
        return userNumber;
    }
}
