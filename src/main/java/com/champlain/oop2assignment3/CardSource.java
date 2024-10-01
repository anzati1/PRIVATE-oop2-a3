package com.champlain.oop2assignment3;

/**
 * Represents a collection of cards that cards can be drawn from.
 * Cards can only be drawn if the collection is not empty.
 */
public interface CardSource {
    /**
     * Returns a card from the source.
     *
     * @return The next available card.
     * @pre !isEmpty()
     */
    Card draw();

    /**
     * @return True if there is no card in the source. False otherwise.
     */
    boolean isEmpty();
}
