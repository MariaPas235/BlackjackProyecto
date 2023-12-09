package View;

import Model.Card;


import java.util.Scanner;


import javax.xml.namespace.QName;

import static View.Menu.deck;
import Model.Player;

public class Interact {
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
        }

        public static int leernumero(){
            Scanner teclado=new Scanner(System.in);
            int leeNumero= teclado.nextInt();
            return leeNumero;
        }
         public static String leerpalabra(){
        Scanner teclado=new Scanner(System.in);
        String leePalabra = teclado.nextLine();
        return leePalabra;
    }


        public static int pedirNumJugadores(){
            int numeroJugadores;
            System.out.println("¿Cuántos jugadores sois?: 1,2,3 ó 4");
            numeroJugadores=leernumero();
            return numeroJugadores;
        }
        public static String pedirNombreJugador1(){

            String nombreJugador1="";
            System.out.println("Inserte el nombre del jugador 1 por favor: ");
            nombreJugador1=leerpalabra();
            return nombreJugador1;
        }

        public static String pedirNombreJugador2(){
            String nombreJugador2;
            System.out.println("Inserte el nombre del jugador 2 por favor: ");
            nombreJugador2=leerpalabra();
            return nombreJugador2;
        }
        public static String pedirNombreJugador3(){
            String nombreJugador3;
            System.out.println("Inserte el nombre del jugador 3 por favor: ");
            nombreJugador3=leerpalabra();
            return nombreJugador3;
        }
        public static String pedirNombreJugador4(){
            String nombreJugador4;
            System.out.println("Inserte el nombre del jugador 4 por favor: ");
            nombreJugador4=leerpalabra();
            return nombreJugador4;
        }
        public static void da2Cartas(Player player){
            Card [] cartasiniciojugador = new Card[2];
            for(int i=0; i<cartasiniciojugador.length;i++){
                do{
                    int cartarandom=(int)(Math.random()*52);
                    cartasiniciojugador[i]=deck.getcards()[cartarandom];
                    deck.getcards()[cartarandom]=null;
                }while(cartasiniciojugador==null);

            }
            player.setDeckplayer(cartasiniciojugador);
        }
        public static void Imprimir2CartaPlayer(Player player){
            String name = player.getNamePlayer();
            System.out.println("Perfecto " + name + " tus 2 primeras cartas son: ");

        }


    }

