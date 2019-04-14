package task4.model;

import java.util.Iterator;
import java.util.LinkedList;

public class Model {
    LinkedList<Abonent> listAbonents;
    public Model(){
        this.listAbonents = new LinkedList<Abonent>();
    }

    public void addAbonent(Abonent abonent){
        this.listAbonents.add(abonent);
    }

    /**
     *
     * @param searchFIO ім'я абонента, якого потрібно знайти
     * @return знайденого абонента або null
     */
    public Abonent searchAbonent(FIO searchFIO){
        if((listAbonents == null) || (listAbonents.isEmpty())) return null;
        for(Iterator<Abonent> iterator = listAbonents.iterator(); iterator.hasNext();){
            Abonent currentAbonent = iterator.next();
            if (currentAbonent.getFio().equals(searchFIO)) return currentAbonent;
        }
        return null;
    }

    /**
     *
     * @return всіх абонентів, або null
     */
    public Abonent getAbonent(){ //TO-DO
        return listAbonents.getFirst();}
}
