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

    @Override
    public int getValue() {
//        for (BlackJackCard cards : hand){
//            System.out.println(cards.getRank());
//        }
        return 0;
    }
}
