package com.company;

public class Boss extends GameEntity{


    private Weapon weapon;



    public Boss(String name, int health, int damage,  Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + " Name of weapon:" + weapon.getNameOfWeapon() + " | " + " Type of weapon:" + weapon.getTypeOfWeapon();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
