package src.blackjack;

import src.blackjacktest.CardTest;

public class playblackjack {
    public static void main(String[] args) {
        CardTest.run(new BlackJackCard(Face.ACE, Suit.CLUB));
    }
}
