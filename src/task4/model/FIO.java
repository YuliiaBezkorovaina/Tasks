package task4.model;

import java.util.Objects;

public class FIO {
    private String firstName;
    private String lastName;
    private String middleName;
    private String nickName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FIO)) return false;
        FIO fio = (FIO) o;
        return Objects.equals(firstName, fio.firstName) &&
                Objects.equals(lastName, fio.lastName) &&
                Objects.equals(middleName, fio.middleName) &&
                Objects.equals(nickName, fio.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, nickName);
    }
}
