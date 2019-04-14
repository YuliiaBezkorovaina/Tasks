package task1;

import task1.control.Control;
import task1.model.Model;
import task1.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Control control = new Control(view, model);
        control.run();
    }
}
