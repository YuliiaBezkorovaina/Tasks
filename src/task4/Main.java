package task4;

import task4.control.Control;
import task4.model.Model;
import task4.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Control control = new Control(view, model);
        control.run();
    }
}
