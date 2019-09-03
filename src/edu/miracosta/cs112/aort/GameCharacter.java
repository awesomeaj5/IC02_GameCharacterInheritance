package edu.miracosta.cs112.aort;
/**
 * Class creates character in role playing game
 */

import java.util.Objects;
import java.util.Random;

public class GameCharacter {

/**
 * Constructor creates a new character given its name
 */
protected String mName;
protected int mLevel;
protected int mHealthPoints;
protected int mMagic;
protected int mGold;

/**
 * Constructor creates name and level of creator
 * @param name Name of character
 */
public GameCharacter(String name) {
        this(name, 1);
        }

/**
 * Constructor creates traits of character
 * @param name Name of Character
 * @param level Level of Character
 */

public GameCharacter(String name, int level) {
        mName = name;
        mLevel = level;
        mHealthPoints = 100 * mLevel;
        mMagic = 100 * mLevel;
        mGold = 100 * mLevel;
        }


public String getName() {
        return mName;
        }

/**
 *
 * @param name
 */
public void setName(String name) {
        mName = name;
        }

public int getHealthPoints() {
        return mHealthPoints;
        }

public int getLevel() {
        return mLevel;
        }

public int getMagic() {
        return mMagic;
        }

public int getGold() {
        return mGold;
        }

@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameCharacter that = (GameCharacter) o;
        return mLevel == that.mLevel &&
        mHealthPoints == that.mHealthPoints &&
        mMagic == that.mMagic &&
        mGold == that.mGold &&
        mName.equals(that.mName);
        }

@Override
public int hashCode() {
        return Objects.hash(mName, mLevel, mHealthPoints, mMagic, mGold);
        }

@Override
public String toString() {
        return "Game Character{" +
        "Name ='" + mName + '\'' +
        ", Level = " + mLevel +
        ", Health Points = " + mHealthPoints +
        ", Magic = " + mMagic +
        ", Gold = " + mGold +
        '}';
        }


        public void attack(GameCharacter other)
        {
                System.out.println(mName + "does not attack. I'm peaceful ");

        }
public void rest(GameCharacter other)
        {
                System.out.println(other + "never rests");

        }

public void assist(GameCharacter other){
        System.out.println(mName + "Does not assist! ");
}

        }
