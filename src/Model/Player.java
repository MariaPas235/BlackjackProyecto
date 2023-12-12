package Model;

import java.util.Arrays;
import java.util.Objects;

public class Player {

    private String namePlayer;
    private Card[] deckplayer;
    private int sumaPuntos;

    private double dineroHucha;

    private double dineroApostado;

    public Player(String namePlayer, Card[] deckplayer, int sumaPuntos, double dineroHucha, double dineroApostado) {
        this.namePlayer = namePlayer;
        this.deckplayer = deckplayer;
        this.sumaPuntos = sumaPuntos;
        this.dineroHucha = dineroHucha;
        this.dineroApostado=dineroApostado;
    }
    public Player(){
        this("",null,0,50,0);
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


    public double getDineroHucha() {
        return dineroHucha;
    }

    public void setDineroHucha(double dineroHucha) {
        this.dineroHucha = dineroHucha;
    }

    public double getDineroApostado() {
        return dineroApostado;
    }

    public void setDineroApostado(double dineroApostado) {
        this.dineroApostado = dineroApostado;
    }

    @Override
    public String toString() {
        return "Player{" +
                "namePlayer='" + namePlayer + '\'' +
                ", deckplayer=" + Arrays.toString(deckplayer) +
                ", sumaPuntos=" + sumaPuntos +
                ", dineroHucha=" + dineroHucha +
                ", dineroApostado=" + dineroApostado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return sumaPuntos == player.sumaPuntos && Double.compare(dineroHucha, player.dineroHucha) == 0 && Double.compare(dineroApostado, player.dineroApostado) == 0 && Objects.equals(namePlayer, player.namePlayer) && Arrays.equals(deckplayer, player.deckplayer);
    }



}
