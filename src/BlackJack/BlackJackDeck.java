package src.BlackJack;

import src.BlackJackBase.PCard;
import src.BlackJackBase.PDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

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
        ArrayList<Double> rand = new ArrayList<>();
        for(int i = 0; i < cards.size(); i++){
            rand.add(Math.random());
        }
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
