package com.champlain.oop2assignment3;

public class NumberOfAcesStrategy implements ScoringStrategy {
    @Override
    public int calculateScore(CardCollection pCards) {
        int count = 0;
        for (Card card : pCards) {
            if (card.getRank() == Rank.ACE) {
                count++;
            }
        }
        return count;
    }
}