package org.example;

public class Robot implements Attacker {

//    Instance Variables

    public String name;
    public Weapon weapon;

//    Constructor

    public Robot(String name, Weapon weapon) {
        this.weapon = weapon;
        this.name = name;
    }

    public void Attack(){
        System.out.println(this.name + " attacks with their " + weapon.name + " for " + weapon.power + " damage!");

    }

}
