package task4.control;

public class AbonentEx extends Exception {
    private String login;
    public String getLogingData(){ return login;}
    AbonentEx(String mess, String login){
        super(mess);
        this.login = login;
    }
}
