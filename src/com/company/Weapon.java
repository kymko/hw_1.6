package com.company;

public class Weapon {

    private String nameOfWeapon;
    private String typeOfWeapon;


    public Weapon(String nameOfWeapon, String typeOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
        this.typeOfWeapon = typeOfWeapon;
    }


    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}
