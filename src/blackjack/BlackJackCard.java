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

import src.blackjackbase.PCard;

import java.awt.*;

public class BlackJackCard extends PCard {
    private  Color BACKGROUND = new Color(237, 230, 220);

    private Face rank;
    private Suit suit;
    private boolean hidden;

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
        for(Face f : Face.values()){
            if(f.value == rank) {
                this.rank = f;
            }
        }
    }

    public void setSuit(int suit) {
        for(Suit s : Suit.values()){
            if(s.value == suit) {
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

    }

    @Override
    public void showCard() {

    }

    @Override
    public boolean isHidden() {
        return false;
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
        return BACKGROUND;
    }

    @Override
    public Color getBorderColor() {
        return suit.color;
    }
}
