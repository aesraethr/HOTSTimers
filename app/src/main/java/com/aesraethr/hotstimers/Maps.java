package com.aesraethr.hotstimers;

/**
 * Created by Aesraethr on 10/06/2015.
 */
public enum Maps {
    CURSED_HOLLOW(1,"Cursed Hollow"),
    HAUNTED_MINES(2,"Haunted Mines"),
    DRAGON_SHIRE(3,"Dragon Shire"),
    BLACKHEARTS_BAY(4,"Blackheart's Bay"),
    GARDEN_TERROR(5,"Garden of Terror"),
    SKY_TEMPLE(6,"Sky Temple"),
    SPIDER_TOMB(7,"Tomb of the Spider Queen");

    private String value;
    private int position;

    Maps(int position, String value) {
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return value;
    }
}
