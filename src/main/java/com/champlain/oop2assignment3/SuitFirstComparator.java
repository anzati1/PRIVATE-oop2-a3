package com.champlain.oop2assignment3;

import java.util.Comparator;

public class SuitFirstComparator implements Comparator<Card> {

    /**
     * Compares two cards by their suit.
     *
     * @param pCard1 the first card to be compared
     * @param pCard2 the second card to be compared
     * @return a negative integer, zero, or a positive integer as the first card's suit
     *  depending on if it is less than, equal to, or greater than the second card's suit.
     */
    @Override
    public int compare(Card pCard1, Card pCard2) {
        return pCard1.getSuit().compareTo(pCard2.getSuit());
    }
}