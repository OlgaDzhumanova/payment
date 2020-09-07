package ru.sbrf.Sbol;

import java.util.Scanner;

public class Application {
    private String host;
    private String ip;
    private String protocol;
    private String port;

    Scanner scanner = new Scanner(System.in);
    MyException myException = new MyException();

    public void Pay(){

    }
    public void EnterPhoneNumber(){
        System.out.println("Введите номер телефона");
        String phoneNumber = scanner.next();
        myException.MyException(phoneNumber);

    }
    public void EnterAmount(){
        System.out.println("Введите сумму");
        float amount = scanner.nextFloat();
    }
    public void EnterCurrency(){
        System.out.println("Введите валюту");
        String currency = scanner.next();
    }
}
