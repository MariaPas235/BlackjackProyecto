package Controller;

import Model.Bet;
import Model.Card;
import Model.Deck;
import Model.Player;
import Model.Game;

import static Model.Game.*;
import static View.Interact.*;
import static View.Interact.ImprimirNuevasCartas;

public class Controller {

    public static void EmpezarJuego(){
        juego();
    }


        public static void juego() {
            Deck deck = new Deck();
            Bet bet = new Bet();
            Player player1 = new Player();
            Player player2 = new Player();
            Player player3 = new Player();
            Player player4 = new Player();
            Player banca = new Player("Banca");

            ImprimirInicio();
            double opcion = 0;
            opcion = pedirNumJugadores();
            switch ((int) opcion) {
                case 1:
                    pedirNombreJugador(player1);
                    da2Cartas(player1, deck);
                    ajustarValores(player1);
                    Imprimir2CartaPlayer(player1, bet);
                    ImprimirHucha(player1);
                    PedirApuesta(player1, bet);
                    ImprimirHucha(player1);
                    double eleccion1 = 0;
                    do {

                        eleccion1 = Elegircartas();
                        switch ((int) eleccion1) {
                            case 1:
                                daNuevaCarta(player1, deck);
                                ajustarValores(player1);
                                ImprimirNuevasCartas(player1, bet);
                                if (SumarPuntos(player1) >= 21) {
                                    eleccion1 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion1 != 2);

                    ImprimirFinTurno();

                    jugarBanca(deck, player1.getSumaPuntos(), banca,bet);
                    Player[] ganador = {player1, banca};
                    Player ganadores = sacarGanador(ganador);
                    DarPremio1jugador(bet, ganadores);


                    break;


                case 2:
                    pedirNombreJugador(player1);
                    da2Cartas(player1, deck);
                    ajustarValores(player1);
                    Imprimir2CartaPlayer(player1, bet);
                    ImprimirHucha(player1);
                    PedirApuesta(player1, bet);
                    ImprimirHucha(player1);
                    double eleccion2 = 0;
                    do {

                        eleccion2 = Elegircartas();
                        switch ((int) eleccion2) {
                            case 1:
                                daNuevaCarta(player1, deck);
                                ajustarValores(player1);
                                ImprimirNuevasCartas(player1, bet);
                                if (SumarPuntos(player1) >= 21) {
                                    eleccion2 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion2 != 2);

                    ImprimirFinTurno();
                    pedirNombreJugador(player2);
                    da2Cartas(player2, deck);
                    ajustarValores(player2);
                    Imprimir2CartaPlayer(player2, bet);
                    ImprimirHucha(player2);
                    PedirApuesta(player2, bet);
                    ImprimirHucha(player2);

                    do {

                        eleccion2 = Elegircartas();
                        switch ((int) eleccion2) {
                            case 1:
                                daNuevaCarta(player2, deck);
                                ajustarValores(player2);
                                ImprimirNuevasCartas(player2, bet);
                                if (SumarPuntos(player2) >= 21) {
                                    eleccion2 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion2 != 2);

                    ImprimirFinTurno();


                    Player winner[] = {player1, player2};
                    Player winnevsr = comprobarVSBanca(winner);

                    jugarBanca(deck, winnevsr.getSumaPuntos(), banca,bet);

                    Player[] ganador2 = {winnevsr, banca};
                    Player ganadores2 = sacarGanador(ganador2);
                    DarPremio(bet, ganadores2);



                    break;


                case 3:
                    pedirNombreJugador(player1);
                    da2Cartas(player1, deck);
                    ajustarValores(player1);
                    Imprimir2CartaPlayer(player1, bet);
                    ImprimirHucha(player1);
                    PedirApuesta(player1, bet);
                    ImprimirHucha(player1);
                    double eleccion3 = 0;
                    do {

                        eleccion3 = Elegircartas();
                        switch ((int) eleccion3) {
                            case 1:
                                daNuevaCarta(player1, deck);
                                ajustarValores(player1);
                                ImprimirNuevasCartas(player1, bet);
                                if (SumarPuntos(player1) >= 21) {
                                    eleccion3 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion3 != 2);

                    ImprimirFinTurno();
                    pedirNombreJugador(player2);
                    da2Cartas(player2, deck);
                    ajustarValores(player2);
                    Imprimir2CartaPlayer(player2, bet);
                    ImprimirHucha(player2);
                    PedirApuesta(player2, bet);
                    ImprimirHucha(player2);

                    do {

                        eleccion3 = Elegircartas();
                        switch ((int) eleccion3) {
                            case 1:
                                daNuevaCarta(player2, deck);
                                ajustarValores(player2);
                                ImprimirNuevasCartas(player2, bet);
                                if (SumarPuntos(player2) >= 21) {
                                    eleccion3 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion3 != 2);

                    ImprimirFinTurno();


                    pedirNombreJugador(player3);
                    da2Cartas(player3, deck);
                    ajustarValores(player3);
                    Imprimir2CartaPlayer(player3, bet);
                    ImprimirHucha(player3);
                    PedirApuesta(player3, bet);
                    ImprimirHucha(player3);

                    do {

                        eleccion3 = Elegircartas();
                        switch ((int) eleccion3) {
                            case 1:
                                daNuevaCarta(player3, deck);
                                ajustarValores(player3);
                                ImprimirNuevasCartas(player3, bet);
                                if (SumarPuntos(player3) >= 21) {
                                    eleccion3 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion3 != 2);

                    ImprimirFinTurno();


                    Player winner2[] = {player1, player2,player3};
                    Player winnevsr2 = comprobarVSBanca(winner2);

                    jugarBanca(deck, winnevsr2.getSumaPuntos(), banca,bet);

                    Player[] ganador3 = {winnevsr2, banca};
                    Player ganadores3 = sacarGanador(ganador3);
                    DarPremio(bet, ganadores3);

                    break;

                case 4:
                    pedirNombreJugador(player1);
                    da2Cartas(player1, deck);
                    ajustarValores(player1);
                    Imprimir2CartaPlayer(player1, bet);
                    ImprimirHucha(player1);
                    PedirApuesta(player1, bet);
                    ImprimirHucha(player1);
                    double eleccion4 = 0;
                    do {

                        eleccion4 = Elegircartas();
                        switch ((int) eleccion4) {
                            case 1:
                                daNuevaCarta(player1, deck);
                                ajustarValores(player1);
                                ImprimirNuevasCartas(player1, bet);
                                if (SumarPuntos(player1) >= 21) {
                                    eleccion4 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion4 != 2);

                    ImprimirFinTurno();


                    pedirNombreJugador(player2);
                    da2Cartas(player2, deck);
                    ajustarValores(player2);
                    Imprimir2CartaPlayer(player2, bet);
                    ImprimirHucha(player2);
                    PedirApuesta(player2, bet);
                    ImprimirHucha(player2);

                    do {

                        eleccion4 = Elegircartas();
                        switch ((int) eleccion4) {
                            case 1:
                                daNuevaCarta(player2, deck);
                                ajustarValores(player2);
                                ImprimirNuevasCartas(player2, bet);
                                if (SumarPuntos(player2) >= 21) {
                                    eleccion4 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion4 != 2);

                    ImprimirFinTurno();


                    pedirNombreJugador(player3);
                    da2Cartas(player3, deck);
                    ajustarValores(player3);
                    Imprimir2CartaPlayer(player3, bet);
                    ImprimirHucha(player3);
                    PedirApuesta(player3, bet);
                    ImprimirHucha(player3);

                    do {

                        eleccion4 = Elegircartas();
                        switch ((int) eleccion4) {
                            case 1:
                                daNuevaCarta(player3, deck);
                                ajustarValores(player3);
                                ImprimirNuevasCartas(player3, bet);
                                if (SumarPuntos(player3) >= 21) {
                                    eleccion4 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion4 != 2);

                    ImprimirFinTurno();

                    pedirNombreJugador(player4);
                    da2Cartas(player4, deck);
                    ajustarValores(player4);
                    Imprimir2CartaPlayer(player4, bet);
                    ImprimirHucha(player4);
                    PedirApuesta(player4, bet);
                    ImprimirHucha(player4);

                    do {

                        eleccion4 = Elegircartas();
                        switch ((int) eleccion4) {
                            case 1:
                                daNuevaCarta(player4, deck);
                                ajustarValores(player4);
                                ImprimirNuevasCartas(player4, bet);
                                if (SumarPuntos(player4) >= 21) {
                                    eleccion4 = 2;
                                }
                                break;
                            case 2:

                                break;
                        }

                    } while (eleccion4 != 2);

                    ImprimirFinTurno();

                    Player winner3[] = {player1, player2,player3,player4};
                    Player winnevsr3 = comprobarVSBanca(winner3);

                    jugarBanca(deck, winnevsr3.getSumaPuntos(), banca,bet);

                    Player[] ganador4 = {winnevsr3, banca};
                    Player ganadores4 = sacarGanador(ganador4);
                    DarPremio(bet, ganadores4);


                    break;
            }


        }



    }









