/*
 *File:lab 10b
 * Description: Black Jack hand
 * working with other's code
 * Lessons Learned:
 *   Colors
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza, Jacob Larsen
 * since: 16 Nov 2022
 */

package src.BlackJack;

import src.BlackJackBase.PCard;
import src.BlackJackBase.PHand;

import java.util.ArrayList;

public class BlackJackHand implements PHand {
    ArrayList<BlackJackCard> hand;

    public BlackJackHand(){
        hand = new ArrayList<BlackJackCard>();
    }
    @Override
    public int getSize() {
        return hand.size();
    }

    @Override
    public void addCard(PCard card) {
        hand.add((BlackJackCard) card);

    }

    @Override
    public PCard getCard(int index) {
        return hand.get(index);
    }

    @Override
    public PCard removeCard(int index) {
        return hand.remove(index);
    }


    /** Returns the point value of the current hand.
     *  Basic BlackJack rules apply:
     *  Ranks 2 - 10 are valued at their face value
     *  Ranks Jack - King are valued at 10
     *  Ace is valued at 11 if the total value of all cards in the hand is <= 21
     *  Otherwise, Ace is valued as 1
     */
    @Override
    public int getValue() {
        int suma = 0;
        int aces = 0;
        for (BlackJackCard card : hand){
            if(2 <= card.getRank() && card.getRank() <= 10){
                suma += card.getRank();
            } else if (card.getRank() != 1) {
                suma += 10;
            } else {
                aces += 1;
            }
        }

        for(int i = 0; i < aces; i++){
            suma += (suma + 11 > 21) ? 1 : 11;
        }
        return suma;
    }
}


