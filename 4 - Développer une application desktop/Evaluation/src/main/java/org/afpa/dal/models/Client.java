package org.afpa.dal.models;

public final class Client {
    private String address;
    private String city;
    private String firstName;
    private int id;
    private String lastName;

    public Client() {
    }

    public Client(String address, String city, String firstName, int id, String lastName) {
        this.address = address;
        this.city = city;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
