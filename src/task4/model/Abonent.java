package task4.model;

import java.util.LinkedList;

public class Abonent {
    private FIO fio;
    private StringBuilder comments;
    private LinkedList<Group> group;
    private Contacts contacts = new Contacts();
    private Adress adress = new Adress();
    private String createDate;
    private String editDate;


    public FIO getFio() {
        return fio;
    }

    public void setFio(FIO fio) {
        this.fio = fio;
    }

    public StringBuilder getComments() {
        return comments;
    }

    public void setComments(StringBuilder comments) {
        this.comments = comments;
    }

    public LinkedList<Group> getGroup() {
        return group;
    }

    public void setGroup(LinkedList<Group> group) {
        this.group = group;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }
}
