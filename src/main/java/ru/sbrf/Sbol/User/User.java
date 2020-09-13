package ru.sbrf.Sbol.User;

import java.util.Scanner;

public class User {
    private String accountNumber;
    private String userNumber;

    Scanner scanner = new Scanner(System.in);

    public void getAccountNumber(){
        System.out.println("Укажите номер счета.");
        accountNumber = scanner.next();
    }
    public void getUserNumber(){
        System.out.println("Введите свой номер пользователя.");
        userNumber = scanner.next();
    }
}
