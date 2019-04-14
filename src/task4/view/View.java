package task4.view;

import task4.model.Abonent;

import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;


public class View {

    public static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("task4.language",
                new Locale("ua", "UA"));
    }


   public void printAbonents(Abonent abonent){

           System.out.println(bundle.getString("FIRST_NAME"));
           System.out.println(abonent.getFio().getFirstName());
           System.out.println(bundle.getString("MIDDLE_NAME"));
           System.out.println(abonent.getFio().getMiddleName());
           System.out.println(bundle.getString("LAST_NAME"));
           System.out.println(abonent.getFio().getLastName());
           System.out.println(bundle.getString("NICK_NAME"));
           System.out.println(abonent.getFio().getFirstName());
           /*System.out.println(bundle.getString("EMAIL"));
           System.out.println(abonent.getContacts().getEmail());*/
           System.out.println(bundle.getString("PHONE_MOBILE"));
           System.out.println(abonent.getContacts().getPhoneMobile());
           System.out.println(bundle.getString("PHONE_HOME"));
           System.out.println(abonent.getContacts().getPhoneHome());
           System.out.println(bundle.getString("SKYPE"));
           /*System.out.println(abonent.getContacts().getSkype());
           System.out.println(bundle.getString("COMMENT"));
           System.out.println(abonent.getComments());
           System.out.println(bundle.getString("ADRESS"));
           System.out.println(bundle.getString("INDEX"));
           System.out.println(abonent.getAdress().getIndex());
           System.out.println(bundle.getString("CITY"));
           System.out.println(abonent.getAdress().getCity());
           System.out.println(bundle.getString("STREET"));
           System.out.println(abonent.getAdress().getStreet());*/
           System.out.println(bundle.getString("BUILDING"));
           System.out.println(abonent.getAdress().getBuilding());
         /*  System.out.println(bundle.getString("FLAT"));
           System.out.println(abonent.getAdress().getFlat());
           System.out.println(bundle.getString("GROUP"));
           System.out.println(abonent.getGroup());*/

   }
}
