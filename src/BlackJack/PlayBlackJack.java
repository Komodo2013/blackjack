/*
 *File:lab 10a
 * Description: Black Jack hand
 * working with other's code
 * Lessons Learned:
 *   Other objects
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza, Jacob Larsen
 * since: 16 Nov 2022
 */

package src.BlackJack;

import src.BlackJackBase.PDeck;
import src.BlackJackBase.PGame;
import src.BlackJackTest.CardTest;
import src.BlackJackTest.DeckTest;
import src.BlackJackTest.HandTest;

import java.awt.*;

/* TODO:
    Dealer’s first card is hidden unless there is a Black Jack on the initial deal. (4 points)
 */

public class PlayBlackJack {
    public static void main(String[] args) {

        //CardTest.run(new BlackJackCard(Face.ACE, Suit.SPADE));

        /*BlackJackDeck deck = new BlackJackDeck();
        deck.shuffle();
        DeckTest.run(deck);*/


        /*BlackJackHand hand = new BlackJackHand();
        BlackJackDeck deck1 = new BlackJackDeck();
        deck1.shuffle();
        HandTest.run(deck1,hand);*/

        PGame.setBackgroundColor(new Color(0, 138, 47));
        PGame.setBannerColor(new Color(64, 64, 64));
        PGame.setBannerTextColor(new Color(252, 252, 252));
        PGame.setButtonColor(new Color(192, 192, 192));
        PGame.setButtonTextColor(new Color(2, 2, 2));
        PGame.setButtonHighlightColor(new Color(253, 0, 8));
        PGame.setFont("Times New Roman");

        BlackJackDeck deck2 = new BlackJackDeck();

        BlackJackHand Dealer = new BlackJackHand();
        //Dealer.getCard(0).hideCard();
        BlackJackHand Player = new BlackJackHand();

        PGame.run(deck2, Dealer, Player);

    }
}
