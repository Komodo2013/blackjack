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

import java.awt.*;

public class BlackJackCard extends PCard {
    private Color BACKGROUND = new Color(237, 230, 220);

    private Face rank;
    private Suit suit;
    private boolean hidden = false;

    public BlackJackCard(Face rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
        this.hidden = false;
    }

    public BlackJackCard(int rank, int suit) {
        super();
        setRank(rank);
        setSuit(suit);
        this.hidden = false;
    }
    // Getters

    public int getRank() {
        return rank.value;
    }

    public int getSuit() {
        return suit.value;
    }

    // Setters
    public void setRank(int rank) {
        for (Face f : Face.values()) {
            if (f.value == rank) {
                this.rank = f;
            }
        }
    }

    public void setSuit(int suit) {
        for (Suit s : Suit.values()) {
            if (s.value == suit) {
                this.suit = s;
            }
        }
    }

    public void setRank(Face rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }


    @Override
    public void hideCard() {
        hidden = true;
    }

    @Override
    public void showCard() {
        hidden = false;
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    @Override
    public String getText() {
        return rank.name + suit.name;
    }

    @Override
    public Color getFontColor() {
        return suit.color;
    }

    @Override
    public Color getFaceColor() {
        return BACKGROUND;
    }

    @Override
    public Color getBackColor() {
        return new Color(145, 145, 194);
    }

    @Override
    public Color getBorderColor() {
        return new Color(33, 43, 168);
    }

    @Override
    public Color getStripeColor() {
        return new Color(33, 43, 168);
    }
}
