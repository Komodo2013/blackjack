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

package src.blackjack;

import src.BlackJackTest.CardTest;

public class playblackjack {
    public static void main(String[] args) {
        CardTest.run(new BlackJackCard(Face.ACE, Suit.CLUB));
    }
}
