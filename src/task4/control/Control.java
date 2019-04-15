package task4.control;


import task4.model.Model;
import task4.view.View;

import java.util.Scanner;

public class Control {
    private Model model;
    private View view;

    public Control(View view, Model  model){
        this.view = view;
        this.model = model;
    }

    public void run(){
    Scanner scanner = new Scanner(System.in);
    InputInfo inputInfo = new InputInfo(scanner);
    model.addAbonent(inputInfo.input());
    view.printAbonents(model.getAbonent());

    }
}
