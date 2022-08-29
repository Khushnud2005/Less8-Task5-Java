package uz.exemple.less8_task5_java.models;

public class ContactModel {
    private String name;
    private String phone;

    public ContactModel(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
