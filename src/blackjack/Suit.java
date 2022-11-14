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

import java.awt.*;

public enum Suit {
    SPADE(1, new Color(0,0,0), "♠"),
    CLUB(2, new Color(0,0,0), "♣"),
    HEART(3, new Color(255,0,0), "♥"),
    DIAMOND(4, new Color(255,0,0), "♦");
    public final int value;
    public final Color color;
    public final String name;

    private Suit(int v, Color c, String n) {
        this.value = v;
        this.color = c;
        this.name = n; // Python is superior //agree
    }
}
