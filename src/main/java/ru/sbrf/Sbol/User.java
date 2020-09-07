package ru.sbrf.Sbol;

import java.io.*;

public class User {
    private String accountNumber;
    private String userNumber;

    public void EnterUser() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите номер клиента");
        userNumber = bufferedReader.readLine();
        System.out.println("Введите номер счета");
        accountNumber = bufferedReader.readLine();
    }


}
