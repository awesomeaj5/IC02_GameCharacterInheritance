package edu.miracosta.cs112.aort;

import java.util.Random;

public class Villain extends GameCharacter {
    public Villain(String name) {
        super(name);
    }
// super(...) method calls
// constructor class
    public Villain(String name, int level) {
        super(name, level);
    }
    @Override
    public void attack(GameCharacter other) {

        {

            Random rng = new Random();
            int roll = rng.nextInt(10);

            //Calculate damage = roll * level
            int damage = roll * this.mLevel;


            other.mHealthPoints -= damage;
            //if other character health goes negative, make it 0
            if (other.mHealthPoints < 0)
                other.mHealthPoints = 0;

        }
    }
        @Override
        public void assist(GameCharacter other) {
            System.out.println("Villains do not assist!! We are far too evil for that!");
        }
        public void perish(GameCharacter other)
        {
            System.out.println("Humanity has been restored!! " + other + " has perished!");
        }
        @Override
        public void rest(GameCharacter other)
        {
            System.out.println("Villains never rest! We have nefarious things to do!! ");
        }

    }




