package org.example;

public class Bear implements Attacker{

    public String name;
    public int attackPower;

    public Bear(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks his 'friend' for " + this.attackPower + "!");
    }
}
