package src.blackjack;

public enum Face {
    ACE(1, "1"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(11, "Jack"),
    KNIGHT(12, "Knight"),
    QUEEN(13, "Queen"),
    KING(14, "King");
    public final int value;
    public final String name;

    private Face(int v, String n) {
        this.value = v;
        this.name = n;
    }
}
