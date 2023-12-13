package View;

import Model.Bet;
import Model.Card;
import Model.Deck;
import Model.Player;

import static Model.Game.SumarPuntos;
import static View.Interact.*;
import static View.Interact.ImprimirNuevasCartas;

public class Controller {
    public static void ajustarValores(Player player) {
        Card[] cartas = player.getDeckplayer();
        int aux = 0;
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i].getNumberCard() == 11 || cartas[i].getNumberCard() == 12 || cartas[i].getNumberCard() == 13) {
                aux += 10;
            } else if (cartas[i].getNumberCard() == 1 && aux < 11) {
                aux += 11;
            } else {
                aux += cartas[i].getNumberCard();

            }
        }
        player.setSumaPuntos(aux);
    }

    public static void jugarBanca(Deck deck, int sumaPuntos, Player banca) {
        da2Cartas(banca, deck);
        ajustarValores(banca);
        Imprimir2Carta(banca);
        boolean valid = false;

        do {
            if (sumaPuntos < 21) {

                if (banca.getSumaPuntos() < sumaPuntos) {
                    daNuevaCarta(banca, deck);
                    ajustarValores(banca);
                    SumarPuntos(banca);
                    ImprimirNuevasCartas(banca);
                } else {
                    valid = true;
                }

            } else {
                valid = true;

            }

        } while (!valid);


    }

    public static Player comprobarVSBanca(Player[] players) {
        Player winner = null;
        int aux = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getSumaPuntos() > aux && players[i].getSumaPuntos() <= 21) {
                aux = players[i].getSumaPuntos();
                winner = players[i];
            }
        }
        return winner;
    }

    public static Player sacarGanador(Player[] players){
        Player win= null;
        int aux=0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getSumaPuntos() > aux && players[i].getSumaPuntos() <= 21) {
                aux = players[i].getSumaPuntos();
                win = players[i];
            }

        }
        System.out.println("El ganador es: " +win.getNamePlayer());
        return win;
    }

    public static void DarPremio1jugador(Bet bet, Player player){
        player.setDineroHucha(player.getDineroHucha()+bet.getDineroGlobalApostado()*2);
        System.out.println("Tu premio es " + bet.getDineroGlobalApostado()+" €");
        System.out.println("Tu hucha se ha actualizado a:  "+player.getDineroHucha()+" €");
    }

    public static void DarPremio(Bet bet, Player player){
        player.setDineroHucha(player.getDineroHucha()+bet.getDineroGlobalApostado());
        System.out.println("Tu premio es " + bet.getDineroGlobalApostado()+" €");
        System.out.println("Tu hucha se ha actualizado a:  "+player.getDineroHucha()+" €");
    }

    public static void dibujarCarta(Card card){
        System.out.println("  ***************");
        System.out.println("  *             *");
        System.out.println("  *" + card.getSuit()+       "         *");
        System.out.println("  *             *");
        System.out.println("  *" +card.getNumberCard()+  "         *");
        System.out.println("  *             *");
        System.out.println("  * "  + card.getSuit()+     "         *");
        System.out.println("  *             *");
        System.out.println("  ***************");
    }

    }

