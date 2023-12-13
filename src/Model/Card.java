package Model;

import java.util.Objects;

public class Card {
    private String suit;

    private int numberCard;

    public Card(String suit, int numberCard){
        this.suit=suit;
        this.numberCard=numberCard;
    }

    public Card(){
        this(" ",0);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    @Override
    public String toString() {
        return "╔══════════╗\n" +
                "║" + numberCard + "         ║\n" +
                "║          ║\n" +
                "║    " + suit + "     ║\n" +
                "║          ║\n" +
                "║         " + numberCard + "║\n" +
                "╚══════════╝";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return numberCard == card.numberCard && Objects.equals(suit, card.suit);
    }

}
