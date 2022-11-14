package src.blackjack;

import java.awt.*;

public enum Suit {
    SPADE(1, new Color(0,0,0), "Spades"),
    CLUB(2, new Color(0,0,0), "Clubs"),
    HEART(3, new Color(255,0,0), "Hearts"),
    DIAMOND(4, new Color(255,0,0), "Diamonds");
    public final int value;
    public final Color color;
    public final String name;

    private Suit(int v, Color c, String n) {
        this.value = v;
        this.color = c;
        this.name = n; // Python is superior
    }
}
