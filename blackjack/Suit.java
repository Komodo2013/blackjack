package blackjack;

public enum Suit {
    SPADE(1),
    CLUB(2),
    HEART(3),
    DIAMOND(4);
    public final int value;

    private Suit(int v) {
        this.value = v;
    }
}
