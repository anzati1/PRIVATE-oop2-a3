package com.champlain.oop2assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a deck of playing cards.
 * <p>
 * This class allows for creating a standard deck, shuffling it, drawing cards,
 * and checking if the deck is empty.
 * It implements the {@link CardSource} interface and extends {@link CardCollection}.
 * </p>
 */
public class Deck extends CardCollection implements CardSource {
    /**
     * The list of cards in the deck.
     */
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Constructs a new Deck containing all standard playing cards.
     * The deck is initialized with one of each rank and suit combination.
     */
    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    /**
     * Static inner class that holds the singleton instance of the deck.
     * The inner class is not loaded until it is referenced to ensure lazy initialization.
     */
    private static class Holder {
        private static final Deck INSTANCE = new Deck();
    }

    /**
     * Provides global access to the singleton instance of the deck.
     *
     * @return the single instance of Deck
     */
    public static Deck getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * Shuffles the cards in this deck randomly.
     */
    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    /**
     * Draws a card from the deck, removing it from the deck.
     *
     * @return the drawn card from the deck
     */
    public Card draw() {
        int last = this.aCards.size() - 1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    /**
     * Checks if the deck is empty.
     *
     * @return {@code true} if the deck contains no cards; {@code false} otherwise
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns an iterator over the cards in this deck.
     *
     * @return an iterator for the cards
     */
    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    /**
     * Returns the number of cards currently in the deck.
     *
     * @return the count of cards in the deck
     */
    public int size() {
        return this.aCards.size();
    }

    /**
     * Sorts the deck with cards sorted by rank first.
     */
    public void sortRankFirst() {
        this.aCards.sort(new RankFirstComparator());
    }

    /**
     * Sorts the deck with cards sorted by suit first.
     */
    public void sortSuitFirst() {
        this.aCards.sort(new SuitFirstComparator());
    }
}