/*
 *File:lab 10a
 * Description: Black Jack hand
 * working with other's code
 * Lessons Learned:
 *   Other objects
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza, Jacob Larsen
 * since: 16 Nov 2022
 */

package src.BlackJack;

public enum Face {
    ACE(1, "A"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(11, "J"),
    KNIGHT(12, "Kn"),
    QUEEN(13, "Q"),
    KING(14, "K");
    public final int value;
    public final String name;

    private Face(int v, String n) {
        this.value = v;
        this.name = n;
    }
}
