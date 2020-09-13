package ru.sbrf.Sbol.Server;

import ru.sbrf.Sbol.User.User;

import java.util.HashSet;

public class CollectionUsersNumbers {
    HashSet<String> users = new HashSet<String>();
    User user = new User();

    public HashSet<String> getUsers() {
        if(getUsers().contains(user) != true){
            users.add(user.getUserNumber());
        } else {
            System.out.println("Такой элемент уже присутствует");
        }
        return users;
    }
}
