package task4.control;

import task4.model.Model;
import task4.view.View;

public class Control {
    private Model model;
    private View view;

    public Control(View view, Model  model){
        this.view = view;
        this.model = model;
    }

    public void run(){


        view.enterInfo();
    }
}
