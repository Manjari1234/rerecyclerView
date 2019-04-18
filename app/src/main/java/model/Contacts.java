package model;

public class Contacts {
    private String name;
    private String Phone;
    private int imageId;

    public Contacts(String name, String phone, int imageId) {
        this.name = name;
        Phone = phone;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
