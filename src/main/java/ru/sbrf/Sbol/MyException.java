package ru.sbrf.Sbol;

public class MyException {
    public void MyException(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("неверный номер");
        }
    }
}
