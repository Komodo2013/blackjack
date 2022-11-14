/*
 *File:lab 9b
 * Description: Black Jack deck
 * Creating and shuffling deck
 * Lessons Learned:
 *   Shuffle
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza, Jacob Larsen
 * since: 14 Nov 2022
 */

package src.BlackJack;

import src.BlackJackBase.PDeck;
import src.BlackJackTest.CardTest;
import src.BlackJackTest.DeckTest;

public class PlayBlackJack {
    public static void main(String[] args) {
        // CardTest.run(new BlackJackCard(Face.ACE, Suit.CLUB));

        //DeckTest.run();

        BlackJackDeck deck = new BlackJackDeck();
        deck.shuffle();
        DeckTest.run(deck);
    }
}
