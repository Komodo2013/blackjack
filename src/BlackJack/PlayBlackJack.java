/*
 *File:lab 9a
 * Description: Black Jack setup
 * working with other's code
 * Lessons Learned:
 *   Other objects
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza, Jacob Larsen
 * since: 014 Nov 2022
 */

package src.BlackJack;

import src.BlackJackBase.PDeck;
import src.BlackJackTest.CardTest;
import src.BlackJackTest.DeckTest;

public class PlayBlackJack {
    public static void main(String[] args) {
        // CardTest.run(new BlackJackCard(Face.ACE, Suit.CLUB));

        //DeckTest.run();

        DeckTest.run(new BlackJackDeck());
    }
}
