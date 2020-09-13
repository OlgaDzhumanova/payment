package ru.sbrf.Sbol.Server;

import ru.sbrf.Sbol.User.User;

import java.util.HashSet;

public class CollectionAccountNumbers {
    HashSet<String> accounts = new HashSet<String>();
    User user = new User();

    public HashSet<String> getAccounts() {
        if (getAccounts().contains(user) != true){
            accounts.add(user.getAccountNumber());
        } else {
            System.out.println("Такой элемент уже присутствует");
        }
        return accounts;
    }
}
