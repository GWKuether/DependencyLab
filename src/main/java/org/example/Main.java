package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Lightsaber lightsaber = new Lightsaber();
        Axe axe = new Axe();
        Bow bow = new Bow();

        Attacker robot_one = new Robot("Jim", lightsaber);
        Attacker robot_two = new Robot("Thad", axe);
        Attacker robot_three = new Robot("Justine", bow);
        Attacker bear_one = new Bear("Furball", 75);

        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();
        bear_one.Attack();


    }



}