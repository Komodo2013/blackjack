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
import src.BlackJackTest.CardTest;
import src.BlackJackTest.DeckTest;
import src.BlackJackTest.HandTest;

public class PlayBlackJack {
    public static void main(String[] args) {

        //CardTest.run(new BlackJackCard(Face.ACE, Suit.SPADE));

        /*BlackJackDeck deck = new BlackJackDeck();
        deck.shuffle();
        DeckTest.run(deck);*/


        BlackJackHand hand = new BlackJackHand();
        BlackJackDeck deck1 = new BlackJackDeck();
        deck1.shuffle();
        HandTest.run(deck1,hand);

    }
}
