package com.champlain.oop2assignment3;

import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {

        /**
         * Compares two cards by their rank.
         *
         * @param pCard1 the first card to be compared
         * @param pCard2 the second card to be compared
         * @return a negative integer, zero, or a positive integer,
         * depending on if the first card's rank is less than,
         * equal to, or greater than the second card's rank.
         */
        @Override
        public int compare(Card pCard1, Card pCard2) {
            return pCard1.getRank().compareTo(pCard2.getRank());
        }
}
