package View;

import Model.Bet;
import Model.Card;


import java.util.Scanner;







import Model.Deck;
import Model.Player;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static Model.Game.leernumero;
import static Model.Game.leerpalabra;

public class Interact {

    static Player player1 = new Player();
        public static void ImprimirInicio(){
            System.out.print("                                                                                                                                                     dddddddd                 \n" +
                    "BBBBBBBBBBBBBBBBB     iiii                                                                                                         iiii              d::::::d                 \n" +
                    "B::::::::::::::::B   i::::i                                                                                                       i::::i             d::::::d                 \n" +
                    "B::::::BBBBBB:::::B   iiii                                                                                                         iiii              d::::::d                 \n" +
                    "BB:::::B     B:::::B                                                                                                                                 d:::::d                  \n" +
                    "  B::::B     B:::::Biiiiiii     eeeeeeeeeeee    nnnn  nnnnnnnn    vvvvvvv           vvvvvvv    eeeeeeeeeeee    nnnn  nnnnnnnn    iiiiiii     ddddddddd:::::d    ooooooooooo   \n" +
                    "  B::::B     B:::::Bi:::::i   ee::::::::::::ee  n:::nn::::::::nn   v:::::v         v:::::v   ee::::::::::::ee  n:::nn::::::::nn  i:::::i   dd::::::::::::::d  oo:::::::::::oo \n" +
                    "  B::::BBBBBB:::::B  i::::i  e::::::eeeee:::::een::::::::::::::nn   v:::::v       v:::::v   e::::::eeeee:::::een::::::::::::::nn  i::::i  d::::::::::::::::d o:::::::::::::::o\n" +
                    "  B:::::::::::::BB   i::::i e::::::e     e:::::enn:::::::::::::::n   v:::::v     v:::::v   e::::::e     e:::::enn:::::::::::::::n i::::i d:::::::ddddd:::::d o:::::ooooo:::::o\n" +
                    "  B::::BBBBBB:::::B  i::::i e:::::::eeeee::::::e  n:::::nnnn:::::n    v:::::v   v:::::v    e:::::::eeeee::::::e  n:::::nnnn:::::n i::::i d::::::d    d:::::d o::::o     o::::o\n" +
                    "  B::::B     B:::::B i::::i e:::::::::::::::::e   n::::n    n::::n     v:::::v v:::::v     e:::::::::::::::::e   n::::n    n::::n i::::i d:::::d     d:::::d o::::o     o::::o\n" +
                    "  B::::B     B:::::B i::::i e::::::eeeeeeeeeee    n::::n    n::::n      v:::::v:::::v      e::::::eeeeeeeeeee    n::::n    n::::n i::::i d:::::d     d:::::d o::::o     o::::o\n" +
                    "  B::::B     B:::::B i::::i e:::::::e             n::::n    n::::n       v:::::::::v       e:::::::e             n::::n    n::::n i::::i d:::::d     d:::::d o::::o     o::::o\n" +
                    "BB:::::BBBBBB::::::Bi::::::ie::::::::e            n::::n    n::::n        v:::::::v        e::::::::e            n::::n    n::::ni::::::id::::::ddddd::::::ddo:::::ooooo:::::o\n" +
                    "B:::::::::::::::::B i::::::i e::::::::eeeeeeee    n::::n    n::::n         v:::::v          e::::::::eeeeeeee    n::::n    n::::ni::::::i d:::::::::::::::::do:::::::::::::::o\n" +
                    "B::::::::::::::::B  i::::::i  ee:::::::::::::e    n::::n    n::::n          v:::v            ee:::::::::::::e    n::::n    n::::ni::::::i  d:::::::::ddd::::d oo:::::::::::oo \n" +
                    "BBBBBBBBBBBBBBBBB   iiiiiiii    eeeeeeeeeeeeee    nnnnnn    nnnnnn           vvv               eeeeeeeeeeeeee    nnnnnn    nnnnnniiiiiiii   ddddddddd   ddddd   ooooooooooo   \n");

            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" (っ◔◡◔)っ ♥ REGLAS PARA JUGAR BLACKJACK ♥");
            System.out.println(" ");
            System.out.println("          (\u2060｡\u2060◕\u2060‿\u2060◕\u2060｡\u2060)\u2060➜  ♥ Objetivo: Conseguir sumar 21 puntos en tus cartas ♥");
            System.out.println("          (\u2060｡\u2060◕\u2060‿\u2060◕\u2060｡\u2060)\u2060➜  ♥ Como sumar los puntos: Todas las cartas tienen su valor excepto el AS que puede sumar 1 u 11 y J, Q, K que tienen un valor de 10 ♥");
            System.out.println("          ⚠\uFE0F Advertencia: este juego contiene apuestas. Prohibido para menores de 18 años ⚠\uFE0F");
            System.out.println(" ");

            System.out.println(" (っ◔◡◔)っ ♥ COMENZAMOS LA PARTIDA  ♥\"");
            System.out.println(" ");
        }


    /**
     * Pide el número de jugadores al usuario
     * @return número de jugadores que van a jugar
     */
    public static double pedirNumJugadores(){
            double numeroJugadores;
            System.out.println("¿Cuántos jugadores sois?: 1,2,3 ó 4");
            numeroJugadores=leernumero();
            return numeroJugadores;
        }

    /**
     * Pide el nombre de los jugadores que van a jugar
     * @param player le entra el modelo Player, para poder setear el nombre y que se guarde ahí
     */
    public static void pedirNombreJugador(Player player){

            boolean validar=false;
            String nombreJugador = "";


            System.out.println("Inserte el nombre del jugador por favor: ");
            nombreJugador = leerpalabra();

            do {


            if (nombreJugador.trim().length() > 0 && !nombreJugador.equalsIgnoreCase("banca")) {
                // If conditions are met, set the player name
                player.setNamePlayer(nombreJugador);
                validar=true;
            } else {
                // Handle the case where conditions are not met
                System.out.println("Nombre inválido. Por favor inserte otro nombre.");
                nombreJugador=leerpalabra();
                // Optionally, you might want to prompt the user for a new name or take some other action.
            }
            }while (validar==false);


        }

    /**
     * Imprime las dos cartas iniciales que se le dan al jugador además de la puntuación de su mano y de la apuesta que hay en partida
     * @param player le entra el modelo Player para conseguir su nombre, su mazo de cartas y las puntuaciones
     * @param bet le entra el modelo bet para obtener la apuesta global
     */
    public static void Imprimir2CartaPlayer(Player player, Bet bet) {
        String name = player.getNamePlayer();
        Card[] deckplayer = player.getDeckplayer();
        System.out.println("Perfecto " + name + " tus 2 primeras cartas son: ");

        for (int i = 0; i < deckplayer.length; i++) {
            Card card=deckplayer[i];
            System.out.println(deckplayer[i].toString());
        }

        System.out.println("############################################################################################################################");
        System.out.println("#                                                                                                                          #");
        System.out.println("#                          Tu puntuación es: "+player.getSumaPuntos()+"                        Apuesta global: "+bet.getDineroGlobalApostado()+"€"+"                                #");
        System.out.println("#                                                                                                                          #");
        System.out.println("############################################################################################################################");

    }


    public static void ImprimirHucha(Player player){
        System.out.println("Ahora mismo en su hucha hay " + player.getDineroHucha()+ " €");
    }

    /**
     * Pide la apuesta que quiere jugar al jugador
     * @param player le entra el modelo jugador para setear el dinero que le queda en la hucha despues de apostar
     * @param bet le entra el modelo bet para guardar la apuesta en una variable global
     */
    public static void PedirApuesta(Player player, Bet bet){
            double apuesta=0;
        System.out.println("¿Cuánto dinero desea apostar? ");
        apuesta=leernumero();
        player.setDineroHucha(player.getDineroHucha()-apuesta);
        player.setDineroApostado(apuesta);
        bet.setDineroGlobalApostado(apuesta);
    }


    /**
     * Imprime el mazo jugador después de que le dé al jugador una carta nueva
     * @param player le entra el modelo Player para obtener su nombre, su mano jugadora y los puntos totales
     * @param bet le entra el modelo bet para obtener la apuesta global
     */
    public static void ImprimirNuevasCartas(Player player, Bet bet) {
        String name = player.getNamePlayer();
        Card[] deckplayer = player.getDeckplayer();
        System.out.println("Perfecto " + name + " tu mano ahora es:   ");

        for (int i = 0; i < deckplayer.length; i++) {
            Card card = deckplayer[i];
            System.out.println(deckplayer[i].toString());


        }
        System.out.println("############################################################################################################################");
        System.out.println("#                                                                                                                          #");
        System.out.println("#                          Tu puntuación es: " + player.getSumaPuntos() + "                        Apuesta global: " + bet.getDineroGlobalApostado() + "€" + "                               #");
        System.out.println("#                                                                                                                          #");
        System.out.println("############################################################################################################################");
    }

    /**
     * Imprime las nuevas cartas que se le van dando a la banca
     * @param player le entra el modelo Player del que obtendremos el nombre, los puntos y la mano jugadora
     */
    public static void ImprimirNuevasCartas(Player player) {
        String name = player.getNamePlayer();
        Card[] deckplayer = player.getDeckplayer();
        System.out.println("Perfecto " + name + " tu mano ahora es:   ");

        for (int i = 0; i < deckplayer.length; i++) {
            Card card=deckplayer[i];
            System.out.println(deckplayer[i].toString());
            ;


        }
        System.out.println(" Tu puntuación es: "+ player.getSumaPuntos() );
    }


    /**
     * Menú donde podremos elegir que nos den una carta o pasar turno
     * @return la elección elegida
     */
    public static double Elegircartas(){
            double eleccion=0;
        System.out.println("¿Qué desea hacer?: ");
        System.out.println("1. Dame una carta");
        System.out.println("2. Pasar");
        eleccion=leernumero();
        return eleccion;
    }

    public static void ImprimirFinTurno(){
        System.out.println("                                       ==============================================================");
        System.out.println("                                       =                    Su turno ha finalizado                  =");
        System.out.println("                                       ==============================================================");
        System.out.println(" ");

        System.out.println("                                       ==============================================================");
        System.out.println("                                       =                Comienza el siguiente turno                 =");
        System.out.println("                                       ==============================================================");
        System.out.println(" ");

    }

}

