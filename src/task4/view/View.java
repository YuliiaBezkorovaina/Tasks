package task4.view;

import java.util.Locale;
import java.util.ResourceBundle;


public class View {

    public static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("task4.language",
                new Locale("ua", "UA"));
    }

    public void enterInfo(){


    }


    public void messageForm(){}
    public void printForm(){}

}
