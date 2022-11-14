/**
 * File: BJCardTest.java
 * Description: Creating a Test file for the BJCard
 * Lessons Learned: In this lesson I learned how test and use the methods of the class
 * public void getRank() {
 *         BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
 *         assertEquals(card.getRank(), 1);
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza, Jacob Larsen.
 * @since: 11/14/2022.
 */


package src.BlackJack;

import static org.junit.jupiter.api.Assertions.*;

class BJCardTest {

    @org.junit.jupiter.api.Test
    public void getRank() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        assertEquals(card.getRank(), 1);
    }

    @org.junit.jupiter.api.Test
    public void getSuit() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        assertEquals(card.getSuit(), 4);
    }

    @org.junit.jupiter.api.Test
    public void setRank() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        card.setRank(3);
        assertEquals(card.getRank(), 3);

    }

    @org.junit.jupiter.api.Test
    public void setSuit() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        card.setSuit(3);
        assertEquals(card.getSuit(), 3);
    }


    @org.junit.jupiter.api.Test
    public void hideCard() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        card.hideCard();
        assertFalse(card.isHidden());
    }

    @org.junit.jupiter.api.Test
    public void showCard() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        card.showCard();
        assertFalse(card.isHidden());
    }

    @org.junit.jupiter.api.Test
    public void isHidden() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        card.isHidden();
        assertFalse(card.isHidden());
    }

    @org.junit.jupiter.api.Test
    public void getText() {
        BlackJackCard card = new BlackJackCard(Face.ACE, Suit.DIAMOND);
        card.getText();
        assertEquals(card.getText(), "1♦");
    }
}