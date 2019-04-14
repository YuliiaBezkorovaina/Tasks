package task1.view;

import java.util.Scanner;

public class View {

    public void printMessage(String message){
        System.out.println(ViewMessages.CONCLUSION_MESSAGE + message);
    }

    public String readWord(){
        System.out.println(ViewMessages.ENTER_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void errorMessage(){
        System.out.println(ViewMessages.ERROR_MESSAGE);
    }
}
