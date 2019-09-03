package edu.miracosta.cs112.aort;

public class Main {

    public static void main(String[] args) {

Hero me = new Hero("Amazing A.J.", 20);
Villain enemy = new Villain("The Decoder", 10);
Neutral friend = new Neutral ("Friendly Doe", 9);
        System.out.println("~~~The game has started!!~~~");
        System.out.println(me);
        System.out.println(enemy);
        System.out.println(friend);
        System.out.println("~~~ " + me.mName + " has been attacked!!~~~");
        enemy.attack(me);
        System.out.println(me);
        System.out.println(enemy);
        System.out.println(friend);
        System.out.println("~~~" + me.mName + " has assisted thyself!!~~~");
        me.assist(me);
        System.out.println(me);
        System.out.println(enemy);
        System.out.println(friend);
        System.out.println("~~~Everybody rests~~~");
        me.rest(me);
        enemy.rest(enemy);
        friend.rest(friend);
        System.out.println(me);
        System.out.println(enemy);
        System.out.println(friend);


    }
}
