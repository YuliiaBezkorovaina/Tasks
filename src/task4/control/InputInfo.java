package task4.control;

import task4.model.Abonent;
import task4.model.Adress;
import task4.model.Contacts;
import task4.model.FIO;
import task4.view.View;

import java.util.Scanner;

public class InputInfo {
    public enum DAOtest {
        Yuliia("Юлія", "Миколаївна", "Безкоровайна", "BYN", "+380636844393", "0444521514", "6"),
        Maxim("Максим", "Володимирович", "Ляшенко", "MVL", "+380677777777", "0444517852", "5");
        private String login;
        DAOtest(String firstName, String middleName, String lastName, String nickName, String mobyPhone, String homePhome, String building) {
            this.login = nickName;
        }
        public String getLogin(){return this.login;}
    }
    Scanner scaner;
    Abonent currentAbonent = new Abonent();

    public InputInfo(Scanner scanner){
        this.scaner = scanner;
    }

    public Abonent input() {
        currentAbonent.setFio(inputFIO());
        currentAbonent.setContacts(inputContacts());
        currentAbonent.setAdress(inputAdress());
        return currentAbonent;
}

   private FIO inputFIO(){
        FIO fio = new FIO();
        String currentValue;

        System.out.println(View.bundle.getString("FIRST_NAME"));
        currentValue = scaner.nextLine();
        String mat4 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? Regex.FIRST_NAME_UA : Regex.FIRST_NAME_EN;

    if (currentValue.matches(mat4))
        fio.setFirstName(currentValue);
    else fio.setFirstName("null");

    System.out.println(View.bundle.getString("MIDDLE_NAME"));
    currentValue = scaner.nextLine();
    mat4 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? Regex.MIDDLE_NAME_UA : Regex.MIDDLE_NAME_UA;

    if (currentValue.matches(mat4))
        fio.setMiddleName(currentValue);
    else fio.setMiddleName("null");

    System.out.println(View.bundle.getString("LAST_NAME"));
    currentValue = scaner.nextLine();
    mat4 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? Regex.LAST_NAME_UA : Regex.LAST_NAME_EN;

    if (currentValue.matches(mat4))
        fio.setLastName(currentValue);
    else fio.setLastName("null");

    System.out.println(View.bundle.getString("NICK_NAME"));
    currentValue = scaner.nextLine();
try{
    if (currentValue.equals(DAOtest.valueOf("Yuliia").getLogin()))
    throw new AbonentEx("error login as nickname",currentValue);
}
catch (AbonentEx ex){
    System.out.println("Error login" + ex.getLogingData());
}
finally {
    if (currentValue.matches(Regex.NICK_NAME))
        fio.setNickName(currentValue);
    else fio.setNickName("null");

}

    return fio;
}
    private Adress inputAdress() {
        Adress adress = new Adress();
        String currentValue;
        System.out.println(View.bundle.getString("BUILDING"));
        currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.BUIDING))
            adress.setBuilding(currentValue);
        else adress.setBuilding("null");

        return adress;
    }

    private Contacts inputContacts() {
        Contacts contact = new Contacts();
        System.out.println(View.bundle.getString("PHONE_MOBILE"));
        String currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.MOBILE_PHONE))
            contact.setPhoneMobile(currentValue);
        else contact.setPhoneMobile("null");
        System.out.println(View.bundle.getString("PHONE_HOME"));
        currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.HOME_PHONE))
            contact.setPhoneHome(currentValue);
        else contact.setPhoneHome("null");
        System.out.println(View.bundle.getString("SKYPE"));
        currentValue = scaner.nextLine();
        if (currentValue.matches(Regex.SKYPE))
            contact.setSkype(currentValue);
        else contact.setSkype("null");
        return contact;
    }

}
