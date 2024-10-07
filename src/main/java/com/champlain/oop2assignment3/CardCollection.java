package com.champlain.oop2assignment3;

/**
 * Iterable card collection overriding toString method.
 * String output contains all cards in the collection separated by new line chars.
 */
public abstract class CardCollection implements Iterable<Card>{
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }

    /**
     * Returns the number of cards in the collection.
     *
     * @return the count of cards
     */
    public int size() {
        int count = 0;
        for (Card ignored : this) {
            count++;
        }
        return count;
    }
}
