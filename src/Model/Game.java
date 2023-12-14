package Model;
import Model.Player;
import Model.Deck;

import java.util.Scanner;

import static View.Interact.*;


public class Game {


    /**
     * Lee números que introduce el usuario por pantalla
     * @return el número introducido
     */
    public static double leernumero() {
        Scanner teclado = new Scanner(System.in);
        double leeNumero = teclado.nextInt();
        return leeNumero;
    }


    /**
     * Lee String que introduce el usuario por pantalla
     * @return el String introducido
     */
    public static String leerpalabra() {
        Scanner teclado = new Scanner(System.in);
        String leePalabra = teclado.nextLine();
        return leePalabra;
    }

    /**
     * Da dos cartas iniciales al jugador
     * @param player se introduce el modelo Player, ya que guardaremos sus cartas iniciales es su propio mazo
     * @param deck se introduce el modelo Deck, que contiene todas las cartas de la baraja, aquí sacaremos del mazo las cartas que ya se han utilizado
     *
     */
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

    /**
     * Se le proporcionará al jugador una nueva carta
     * @param player le entra el modelo Player del que obtendremos su mazo con las 2 cartas inicales
     * @param deck llamamos al modelo Deck para que nos de el mazo de todas las cartas de la baraja que quedan disponibles
     */
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


    /**
     * Le da las puntuaciones a las cartas
     * @param player llama al modelo Player para conseguir el mazo de su mano y luego poder setear los puntos
     * @return suma total de los puntos
     */
    public static int ajustarValores(Player player) {
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
        return aux;

    }

    /**
     * Compara un array de cartas para saber que jugador de todos juega contra la banca
     * @param players introduce un array de Players, donde al recorrerlo se verá quien tiene mas puntos sin pasarse de 21
     * @return devuelve un winner (persona que tenga mayor puntuación)
     */
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

    /**
     * Te dice que jugador ha ganado, si la banca o el jugador que tenga más puntos
     * @param players entra un array de players, el player winner de la función anterior y la banca
     * @return el ganador
     */
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

    /**
     * Jugador que realiza las operaciones por el mismo
     * @param deck se le pasa el mazo con todas las cartas, ya que ahi mismo llamara a otra funcion para que rellene su mazo jugador
     * @param sumaPuntos variable que devuelve el get y que va a controlar que la banca no se pase de 21
     * @param banca de este modelo se obtendrá su nombre, y su mazo jugador
     * @param bet se obtendrá la apuesta total de partida
     */
    public static void jugarBanca(Deck deck, int sumaPuntos, Player banca, Bet bet) {
        da2Cartas(banca, deck);
        ajustarValores(banca);
        Imprimir2CartaPlayer(banca, bet);
        boolean valid = false;

        do {
            if (sumaPuntos < 21) {

                if (banca.getSumaPuntos() < sumaPuntos) {
                    daNuevaCarta(banca, deck);
                    ajustarValores(banca);
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
