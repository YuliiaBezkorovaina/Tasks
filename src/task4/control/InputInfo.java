package task4.control;

import task4.model.Abonent;
import task4.model.Adress;
import task4.model.Contacts;
import task4.view.View;

import java.util.Scanner;

public class InputInfo {
    Scanner scaner;
    Abonent currentAbonent = new Abonent();

    public void input() {
    scaner = new  Scanner(System.in);

        currentAbonent.setContacts(getContacts());
        currentAbonent.setAdress(getAdress());

        scaner.close();
}


    private Adress getAdress() {
        Adress adress = new Adress();
        String currentValue;
        System.out.println(View.bundle.getString("ENTER_BUILDING"));
        currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.BUIDING))
            adress.setBuilding(currentValue);
        else adress.setBuilding("null");

        return adress;
    }

    private Contacts getContacts() {
        Contacts contact = new Contacts();
        System.out.println(View.bundle.getString("ENTER_PHONE_MOBILE"));
        String currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.MOBILE_PHONE))
            contact.setPhoneMobile(currentValue);
        else contact.setPhoneMobile("null");
        System.out.println(View.bundle.getString("ENTER_PHONE_HOME"));
        currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.HOME_PHONE))
            contact.setPhoneHome(currentValue);
        else contact.setPhoneHome("null");
        System.out.println(View.bundle.getString("ENTER_SKYPE"));
        currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.SKYPE))
            contact.setSkype(currentValue);
        else contact.setSkype("null");
        return contact;
    }

}
