package com.afpa.classes;

public class Client {
    private String name;
    private String firstName;
    private String address;
    private String city;

    public Client() {
        this.name = "";
        this.firstName = "";
        this.address = "";
        this.city = "";
    }

    public Client(String name, String firstName, String address, String city) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Prénom: %s\nNom: %s\nAdresse: %s\nVille: %s\n", this.firstName, this.name, this.address, this.city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
}
