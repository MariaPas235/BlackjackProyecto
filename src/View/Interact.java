package View;

import Model.Bet;
import Model.Card;


import java.util.Scanner;







import Model.Deck;
import Model.Player;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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

        public static double leernumero(){
            Scanner teclado=new Scanner(System.in);
            double leeNumero= teclado.nextInt();
            return leeNumero;
        }
         public static String leerpalabra(){
        Scanner teclado=new Scanner(System.in);
        String leePalabra = teclado.nextLine();
             System.out.println(leePalabra);
        return leePalabra;
    }


        public static double pedirNumJugadores(){
            double numeroJugadores;
            System.out.println("¿Cuántos jugadores sois?: 1,2,3 ó 4");
            numeroJugadores=leernumero();
            return numeroJugadores;
        }
        public static String pedirNombreJugador(Player player){

            String nombreJugador="";
            System.out.println("Inserte el nombre del jugador por favor: ");
            nombreJugador=leerpalabra();
            player.setNamePlayer(nombreJugador);
            return nombreJugador;
        }
    public static void da2Cartas(Player player,Deck deck) {

        Card[] cartasiniciojugador = new Card[2];

        for (int i = 0; i < cartasiniciojugador.length; i++) {
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

    public static void Imprimir2CartaPlayer(Player player, Bet bet) {
        String name = player.getNamePlayer();
        Card[] deckplayer = player.getDeckplayer();
        System.out.println("Perfecto " + name + " tus 2 primeras cartas son:                                                                                    "+" Apuesta global: "+ bet.getDineroGlobalApostado());
        System.out.println("                                                                                                                                    "+" Tu puntuación: "+ player.getSumaPuntos());
        for (int i = 0; i < deckplayer.length; i++) {
            Card card=deckplayer[i];
            System.out.println(deckplayer[i].toString());
        }
    }

    public static void ImprimirPuntos(Player player){
        System.out.println("Tu puntuación total es de: " + player.getSumaPuntos());

    }

    public static void ImprimirHucha(Player player){
        System.out.println("Ahora mismo en su hucha hay " + player.getDineroHucha()+ " €");
    }

    public static void PedirApuesta(Player player, Bet bet){
            double apuesta=0;
        System.out.println("¿Cuánto dinero desea apostar? ");
        apuesta=leernumero();
        player.setDineroHucha(player.getDineroHucha()-apuesta);
        player.setDineroApostado(apuesta);
        bet.setDineroGlobalApostado(apuesta);
    }

    public static void ImprimirApuestaGlobal(Player player){
            double apuestaGlobal=0;
            apuestaGlobal+= player.getDineroApostado();
        System.out.println("La apuesta global es " + apuestaGlobal);
    }



}

