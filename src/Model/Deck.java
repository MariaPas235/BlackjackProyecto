package Model;

public class Deck {
    private Card[] cards = new Card[52];
    private String[] suits = {"♥", "♦", "♣", "♠"};

    public Card[] getcards(){

        return cards;
    }

    public Deck() {
        this.cards = rellenamazo();
    }

    public static void main(String[] args) {
    }

    public Card[] rellenamazo() {
        int aux = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 1; j <= 13; j++) {
                if (suits[i] == "♥" || suits[i] == "♦") {
                    Card cartas = new Card(suits[i], j);
                    cards[aux] = cartas;
                    aux++;

                } else if (suits[i] == "♣" || suits[i] == "♠") {
                    Card cartas = new Card(suits[i], j);
                    cards[aux] = cartas;
                    aux++;
                }

            }

        }

        return cards;
    }
}

