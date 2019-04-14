package task1.control;

import task1.model.Model;
import task1.view.View;

public class Control {
    private View view;
    private Model model;

    public Control(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void run(){
        String enterWord;
        int i = 0;
        do {
             enterWord = view.readWord();

             if (enterWord.equals("Hello"))
             {
                model.setFirstWord(enterWord);
                i++;
             }
             else if ((enterWord.equals("world!"))&&(model.getFirstWord()!=null))
             {
                 model.setSecondWord(enterWord);
                 i++;
             } else{
                 view.errorMessage();
             }
        }while (i != 2);
        view.printMessage(model.getFirstWord()+"\t"+model.getSecondWord());
    }
}
