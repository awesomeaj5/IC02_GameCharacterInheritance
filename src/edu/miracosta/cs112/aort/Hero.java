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
                other.mHealthPoints += 5 * this.mLevel;
                this.mMagic -= 5 * this.mLevel;
                break;
            case 1:
                other.mMagic += 5 * this.mLevel;
                this.mMagic -= 5 * this.mLevel;
                break;
            case 2:
                other.mGold += 5 * this.mLevel;
                this.mGold -= 5 * this.mLevel;
                break;
            case 3:
                other.mLevel ++;
                other.mGold += 100;
                other.mMagic += 100;
                other.mHealthPoints += 100;
                this.mLevel --;
                other.mGold -= 100;
                other.mMagic -= 100;
                other.mHealthPoints -= 100;
                break;
            case 4:
                this.mHealthPoints = mLevel * 100;
                other.mHealthPoints = mLevel * 100;
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

