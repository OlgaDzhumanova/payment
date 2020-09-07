package ru.sbrf.Sbol;

import java.io.IOException;

public class Payment {
    public static void main(String[] args) throws IOException {

        User user = new User();
        user.EnterUser();

        Application application = new Application();
        application.EnterPhoneNumber();
        application.EnterAmount();
        application.EnterCurrency();

    }
}
