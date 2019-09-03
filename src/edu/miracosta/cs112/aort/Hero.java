package edu.miracosta.cs112.aort;

import java.util.Random;

public class Hero extends GameCharacter {

    public Hero(String name) {
        super(name);
    }

    public Hero(String name, int level) {
        super(name, level);
    }

    // ctrl + o = override a method parent
    // @Override = annotation
    @Override
    public void attack(GameCharacter other) {

        {

            Random rng = new Random();
            int roll = rng.nextInt(10);

            int damage = roll * this.mLevel;

            other.mHealthPoints -= damage;
            if (other.mHealthPoints < 0)
                other.mHealthPoints = 0;

        }
    }

    @Override
    public void assist(GameCharacter other)
    {
        Random rng = new Random();
        int roll = rng.nextInt(5);
        switch(roll)
        {
            case 0:
                //other character receives health
                // this character loses health
                other.mHealthPoints += 5 * other.mLevel;
                System.out.println("case 0");
                break;
            case 1:
                other.mMagic += 5 * other.mLevel;
                System.out.println("case 1");
                break;
            case 2:
                other.mGold += 5 * other.mLevel;
                System.out.println("case 2");
                break;
            case 3:
                other.mLevel ++;
                other.mGold += 100;
                other.mMagic += 100;
                other.mHealthPoints += 100;
                System.out.println("case 3");
                break;
            case 4:
                other.mHealthPoints = mLevel * 100;
                System.out.println("case 4");
                break;
        }



    }
    @Override
    public void rest(GameCharacter other)
    {
        other.mHealthPoints += 20;
        other.mMagic += 5;

    }
    public void perish(GameCharacter other)
    {
        System.out.println("All is lost, our hero has perished!!");
    }
}

