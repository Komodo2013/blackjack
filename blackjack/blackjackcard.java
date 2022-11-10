package blackjack;

import blackjackbase.PCard;

public class blackjackcard extends PCard {


    int rank;
    int suit;
    boolean hidden;


    public blackjackcard(int rank, int suit) {
        super();
        this.rank = rank;
        this.suit = suit;
        this.hidden = false;
    }
    // Getters

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    // Setters
    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public void hideCard() {
        this.hidden = true;
    }

    @Override
    public void showCard() {
        this.hidden = false;
    }

    @Override
    public boolean isHidden() {
        return this.hidden;
    }

    @Override
    public String getText() {
        String text = "";
//        switch (rank){
//            case Face.ACE.value:
//                return text = text + "A";
//                break;
//
//
//        }
        return null;
    }
}
