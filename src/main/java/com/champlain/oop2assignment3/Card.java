package com.champlain.oop2assignment3;

import javafx.scene.control.Alert;

/**
 * Represents a playing card with a specific suit and rank.
 * @implNote This class is immutable, meaning that once a card is created, its suit and rank cannot be changed.
 */
public class Card implements Comparable<Card> {
    /**
     * The suit of this card (e.g., Hearts, Diamonds, Clubs, Spades).
     */
    private final Suit aSuit;

    /**
     * The rank of this card (e.g., Ace, 2, 3, ..., King).
     */
    private final Rank aRank;

    /**
     * Constructs a new Card with the specified rank and suit.
     *
     * @param pRank the rank of the card (e.g., Ace, 2, 3, ..., King)
     * @param pSuit the suit of the card (e.g., Hearts, Diamonds, Clubs, Spades)
     */
    public Card (Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    /**
     * Returns the rank of this card.
     *
     * @return the rank of the card
     */
    public Rank getRank() {
        return this.aRank;
    }

    /**
     * Returns the suit of this card.
     *
     * @return the suit of the card
     */
    public Suit getSuit() {
        return this.aSuit;
    }

    /**
     * Returns a string representation of this card.
     *
     * @return a string in the format "Rank of Suit" (e.g., "Ace of Hearts")
     */
    @Override
    public String toString() {
        return this.getRank() + " of " + this.getSuit();
	 }

    @Override
    public int compareTo(Card o) {
        int suitComparison = this.aSuit.ordinal() - o.aSuit.ordinal();
        if (suitComparison != 0) {
            return suitComparison;
        }
        return aRank.ordinal() - o.aRank.ordinal();
    }
    
    /**
     * Checks if the current card is equal to another card
     *
     * @param pObject the card that is being checked
     * @return true if the card is the same, false if the current card and given card are different
     */
    @Override
    public boolean equals(Object pObject) {

        if(this == pObject) {
            return true;
        }
        if(!(pObject instanceof Card)) {
            return false;
        }

        Card pObjectCard = (Card)pObject;

        return this.aRank.equals(pObjectCard.aRank) && this.aSuit.equals(pObjectCard.aSuit);
    }
}
