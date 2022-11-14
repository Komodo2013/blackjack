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

import src.BlackJackBase.PCard;
import src.BlackJackBase.PDeck;

import java.util.*;

public class BlackJackDeck implements PDeck {

    ArrayList<BlackJackCard> cards;

    public BlackJackDeck() {
        cards = new ArrayList<>();
        newDeck();
    }

    public void newDeck(){
        for(Suit s: Suit.values()){
            for(Face f: Face.values()){
                cards.add(new BlackJackCard(f, s));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void addCard(PCard card) {
        cards.add((BlackJackCard) card);
    }

    @Override
    public PCard dealCard() {
        if (cards.size() == 0){
            return null;
        }
        return cards.remove(cards.size()-1);
    }

    @Override
    public PCard dealHiddenCard() {
        if (cards.size() == 0){
            return null;
        }
        cards.get(cards.size()-1).hideCard();
        return cards.remove(cards.size()-1);
    }

    @Override
    public int cardCount() {
        return cards.size();
    }
}
