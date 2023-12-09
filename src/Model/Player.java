package Model;

import java.util.Arrays;
import java.util.Objects;

public class Player {

    private String namePlayer;
    private Card[] deckplayer;
    private int sumaPuntos;

    public Player(String namePlayer, Card[] deckplayer, int sumaPuntos) {
        this.namePlayer = namePlayer;
        this.deckplayer = deckplayer;
        this.sumaPuntos = sumaPuntos;
    }
    public Player(){
        this("",null,0);
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public Card[] getDeckplayer() {
        return deckplayer;
    }

    public void setDeckplayer(Card[] deckplayer) {
        this.deckplayer = deckplayer;
    }

    public int getSumaPuntos() {
        return sumaPuntos;
    }

    public void setSumaPuntos(int sumaPuntos) {
        this.sumaPuntos = sumaPuntos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return sumaPuntos == player.sumaPuntos && Objects.equals(namePlayer, player.namePlayer) && Arrays.equals(deckplayer, player.deckplayer);
    }

    @Override
    public String toString() {
        return "Player{" +
                "namePlayer='" + namePlayer + '\'' +
                ", deckplayer=" + Arrays.toString(deckplayer) +
                ", sumaPuntos=" + sumaPuntos +
                '}';
    }
}
