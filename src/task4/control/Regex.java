package task4.control;

public interface Regex {
    String BUIDING = "^[1-9]+[0-9]+[A-Z]{0,1}[/]{0,1}[1-9]+[0-9]+[A-Z]?$";
    String MOBILE_PHONE = "^[+][3][8][0][1-9]{2}[0-9]{7}$";
    String HOME_PHONE = "^[0-9]{2,4}[0-9]{7}$";
    String SKYPE = "^[A-Za-z]+[0-9_]*[A-Za-z]+[.]{0,1}[A-Za-z]+[0-9_]*[A-Za-z]+$";

    String FIRST_NAME_UA = "";
    String FIRST_NAME_EN = "";

    String MIDDLE_NAME_UA = "";
    String MIDDLE_NAME_EN = "";

    String LAST_NAME_UA = "";
    String LAST_NAME_EN = "";
    String NICK_NAME = "^[A-Za-z0-9_]{3,8}$";
}
