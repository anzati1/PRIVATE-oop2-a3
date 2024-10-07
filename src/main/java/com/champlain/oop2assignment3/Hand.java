package com.champlain.oop2assignment3;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a hand of playing cards.
 * <p>
 * This class allows for adding cards to the hand and checking if the hand is empty.
 * It also provides an iterator to traverse the cards in the hand.
 * </p>
 */
public class Hand extends CardCollection {
    /**
     * The list of cards in this hand.
     */
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Adds a card to this hand.
     *
     * @param pCard the card to be added
     */
    public void addCard(Card pCard) {

        boolean cardCheck = false;

        if(this.aCards.isEmpty()) {
            this.aCards.add(pCard);
            cardCheck = true;
        } else {
            for(int i = 0; i < aCards.size(); i++) {
                if(this.aCards.get(i).equals(pCard)) {
                    Alert selectionErrorAlert = new Alert(Alert.AlertType.INFORMATION, "The card you are trying to add is already in your hand, seems fishy...");
                    selectionErrorAlert.showAndWait();
                    cardCheck = true;
                }
            }
        }
        if(!cardCheck) {
            this.aCards.add(pCard);
        }
    }

    /**
     * Checks if this hand is empty.
     *
     * @return {@code true} if the hand has no cards; {@code false} otherwise
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns an iterator over the cards in this hand.
     *
     * @return an iterator for the cards
     */
    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    /**
     * Sorts the cards in this hand by rank first.
     */
    public void sortRankFirst() {
        this.aCards.sort(new RankFirstComparator());
    }

    /**
     * Sorts the cards in this hand by suit first.
     */
    public void sortSuitFirst() {
        this.aCards.sort(new SuitFirstComparator());
    }

    /**
     * Returns a string representation of the cards in this hand.
     * Each card is separated by a newline character.
     *
     * @return a string depicting all cards in the hand
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Card card : aCards) {
            builder.append(card.toString()).append("\n");
        }
        return builder.toString();
    }
}