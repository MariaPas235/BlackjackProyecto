package Model;
import Model.Player;
import Model.Deck;

import java.util.Scanner;

import static View.Interact.Imprimir2Carta;
import static View.Interact.ImprimirNuevasCartas;


public class Game {

    public static double leernumero() {
        Scanner teclado = new Scanner(System.in);
        double leeNumero = teclado.nextInt();
        return leeNumero;
    }

    public static String leerpalabra() {
        Scanner teclado = new Scanner(System.in);
        String leePalabra = teclado.nextLine();
        return leePalabra;
    }

    public static void da2Cartas(Player player, Deck deck) {

        Card[] cartasiniciojugador = new Card[2];

        for (int i = 0; i < cartasiniciojugador.length; i++) {
            do {
                int cartarandom = (int) (Math.random() * 52);
                // Verificar si la carta obtenida aleatoriamente es null
                if (deck.getcards()[cartarandom] != null) {
                    cartasiniciojugador[i] = deck.getcards()[cartarandom];
                    deck.getcards()[cartarandom] = null;
                }
            } while (cartasiniciojugador[i] == null);
        }
        player.setDeckplayer(cartasiniciojugador);
    }

    public static void daNuevaCarta(Player player, Deck deck) {
        Card[] cartasprimeras = player.getDeckplayer();

        Card[] cartasiniciojugador = new Card[cartasprimeras.length + 1];
        for (int i = 0; i < cartasprimeras.length; i++) {
            cartasiniciojugador[i] = cartasprimeras[i];
        }
        for (int i = cartasprimeras.length; i < cartasiniciojugador.length; i++) {
            do {
                int cartarandom = (int) (Math.random() * 52);
                System.out.println(deck.getcards());
                // Verificar si la carta obtenida aleatoriamente es null
                if (deck.getcards()[cartarandom] != null) {
                    cartasiniciojugador[i] = deck.getcards()[cartarandom];
                    deck.getcards()[cartarandom] = null;
                }
            } while (cartasiniciojugador[i] == null);
        }
        player.setDeckplayer(cartasiniciojugador);
    }

    public static double SumarPuntos(Player player) {
        double puntosTotales = 0;
        Card[] deckplayer = player.getDeckplayer();
        player.getDeckplayer();
        for (int i = 0; i < deckplayer.length; i++) {
            puntosTotales = puntosTotales + deckplayer[i].getNumberCard();
            player.setSumaPuntos((int) puntosTotales);
        }


        return puntosTotales;

    }


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

    public static Player sacarGanador(Player[] players) {
        Player win = null;
        int aux = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getSumaPuntos() > aux && players[i].getSumaPuntos() <= 21) {
                aux = players[i].getSumaPuntos();
                win = players[i];
            }

        }
        System.out.println("\n" +
                "███████ ███    ██ ██   ██  ██████  ██████   █████  ██████  ██    ██ ███████ ███    ██  █████  \n" +
                "██      ████   ██ ██   ██ ██    ██ ██   ██ ██   ██ ██   ██ ██    ██ ██      ████   ██ ██   ██ \n" +
                "█████   ██ ██  ██ ███████ ██    ██ ██████  ███████ ██████  ██    ██ █████   ██ ██  ██ ███████ \n" +
                "██      ██  ██ ██ ██   ██ ██    ██ ██   ██ ██   ██ ██   ██ ██    ██ ██      ██  ██ ██ ██   ██ \n" +
                "███████ ██   ████ ██   ██  ██████  ██   ██ ██   ██ ██████   ██████  ███████ ██   ████ ██   ██ \n" +
                "                                                                                              \n" +
                "                                                                                              \n");

        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("                                  El ganador es: " + win.getNamePlayer());
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        return win;
    }

    public static void DarPremio1jugador(Bet bet, Player player) {
        player.setDineroHucha(player.getDineroHucha() + bet.getDineroGlobalApostado() * 2);
        System.out.println("Tu premio es " + bet.getDineroGlobalApostado() + " €");
        System.out.println("Tu hucha se ha actualizado a:  " + player.getDineroHucha() + " €");
    }

    public static void DarPremio(Bet bet, Player player) {
        player.setDineroHucha(player.getDineroHucha() + bet.getDineroGlobalApostado());
        System.out.println("Tu premio es " + bet.getDineroGlobalApostado() + " €");
        System.out.println("Tu hucha se ha actualizado a:  " + player.getDineroHucha() + " €");
    }

    public static void jugarBanca(Deck deck, int sumaPuntos, Player banca, Bet bet) {
        da2Cartas(banca, deck);
        ajustarValores(banca);
        Imprimir2Carta(banca, bet);
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
}
