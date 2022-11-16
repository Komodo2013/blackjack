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
    Game’s banner color is not white. (2 points)
    Game’s banner text color is not green. (2 points)
    Game’s status text color is not green. (2 points)
    Game’s button color is not blue. (2 points)
    Game’s button highlight color is not cyan. (2 points)
    Game’s button text color is not green. (2 points)
    Game’s font is not Sans Serif. (2 points)
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

        BlackJackDeck deck2 = new BlackJackDeck();
        deck2.shuffle();


        PGame.setBackgroundColor(new Color(21, 98, 4));

        BlackJackHand Dealer = new BlackJackHand();
        BlackJackHand Player = new BlackJackHand();

        PGame.run(deck2, Dealer, Player);

    }
}
